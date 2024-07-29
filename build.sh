CONFIG_FILE := C:/Users/akumarmishr2/projects/petclinic-build/config.txt
MYSQL_USER := root
MYSQL_PASSWORD := password

.PHONY: all setup build_default build_mysql download_mysql_agent run_default run_mysql clean

all: setup build_default build_mysql download_mysql_agent

setup:
	@echo "Copying necessary files..."
	cp -r "C:/Users/akumarmishr2/Desktop/petclinic_source" "C:/Users/akumarmishr2/projects/petclinic-build/petclinic-source"
	@echo "Cloning the Pet Clinic repository..."
	git clone https://github.com/spring-projects/spring-petclinic.git
	cd spring-petclinic && rm -rf Dockerfile docker-compose.yml

build_default:
	@echo "Building the app in default profile..."
	cd spring-petclinic && ./mvnw clean package -DskipTests -Pdefault
	cp spring-petclinic/target/*.jar "C:/Users/akumarmishr2/projects/petclinic-build/default"

build_mysql:
	@echo "Building the app in MySQL profile..."
	cd spring-petclinic && ./mvnw clean package -DskipTests -Pmysql
	cp spring-petclinic/target/*.jar "C:/Users/akumarmishr2/projects/petclinic-build/mysql"

download_mysql_agent:
	@echo "Downloading MySQL binary and Java agent..."
	curl -o mysql.zip https://cdn.mysql.com//Downloads/MySQL-9.0/mysql-9.0.0-winx64.zip
	unzip -o mysql.zip -d "C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary"
	unzip -o java-agent.zip -d "C:/Users/akumarmishr2/projects/petclinic-build/java-agent"

run_default: save_config
	@echo "Running the app in default profile..."
	java -javaagent:"C:/Users/akumarmishr2/projects/petclinic-build/java-agent/opentelemetry-javaagent.jar" -jar "C:/Users/akumarmishr2/projects/petclinic-build/default/*.jar"

run_mysql: save_config
	@echo "Running the app in MySQL profile..."
	"C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary/bin/mysqld" --initialize-insecure --user=mysql --datadir="C:/Users/akumarmishr2/projects/petclinic-build/mysql-data"
	"C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary/bin/mysqld_safe" --user=mysql &
	sleep 10
	java -javaagent:"C:/Users/akumarmishr2/projects/petclinic-build/java-agent/opentelemetry-javaagent.jar" -jar "C:/Users/akumarmishr2/projects/petclinic-build/mysql/*.jar" --spring.profiles.active=mysql --spring.datasource.url=jdbc:mysql://localhost:3306/petclinic --spring.datasource.username=$(MYSQL_USER) --spring.datasource.password=$(MYSQL_PASSWORD)

save_config:
	@echo "Saving configuration..."
	@echo "Profile: $(PROFILE)" > $(CONFIG_FILE)
	@echo "Java Agent: C:/Users/akumarmishr2/projects/petclinic-build/java-agent/opentelemetry-javaagent.jar" >> $(CONFIG_FILE)
	@echo "MySQL: C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary" >> $(CONFIG_FILE)

clean:
	@echo "Cleaning up..."
	rm -rf spring-petclinic mysql.zip java-agent.zip
