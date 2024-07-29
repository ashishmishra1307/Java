#!/bin/bash

# Configuration file to capture and load configuration and profile information
CONFIG_FILE="C:/Users/akumarmishr2/projects/petclinic-build/config.txt"

# Function to load configuration from the file
load_config() {
    if [ -f "$CONFIG_FILE" ]; then
        source "$CONFIG_FILE"
    else
        echo "Configuration file not found!"
    fi
}

# Function to save configuration to the file
save_config() {
    echo "Profile: $PROFILE" > $CONFIG_FILE
    echo "Java Agent: C:/Users/akumarmishr2/projects/petclinic-build/java-agent/opentelemetry-javaagent.jar" >> $CONFIG_FILE
    echo "MySQL: C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary" >> $CONFIG_FILE
}

# Step 1: Copy necessary files
echo "Copying necessary files..."
cp -r C:/Users/akumarmishr2/Desktop/petclinic_source C:/Users/akumarmishr2/projects/petclinic-build/petclinic-source

# Step 2: Get the Pet Clinic app
echo "Cloning the Pet Clinic repository..."
git clone https://github.com/spring-projects/spring-petclinic.git
cd spring-petclinic

# Step 3: Remove Docker files
echo "Removing Docker files..."
rm -rf Dockerfile docker-compose.yml

# Step 4: Build and package the app in two profiles
echo "Building the app in default profile..."
./mvnw clean package -DskipTests -Pdefault
cp target/*.jar C:/Users/akumarmishr2/projects/petclinic-build/default

echo "Building the app in MySQL profile..."
./mvnw clean package -DskipTests -Pmysql
cp target/*.jar C:/Users/akumarmishr2/projects/petclinic-build/mysql

# Step 5: Download MySQL binary and Java agent
echo "Downloading MySQL binary and Java agent..."
curl -o mysql.zip https://cdn.mysql.com//Downloads/MySQL-9.0/mysql-9.0.0-winx64.zip

unzip mysql.zip -d C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary
unzip java-agent.zip -d C:/Users/akumarmishr2/projects/petclinic-build/java-agent

# Step 6: Load configuration
load_config

# Step 7: Run the app with selected profile and agent
echo "Running the app..."
PROFILE=$1
if [ "$PROFILE" == "default" ]; then
    java -javaagent:C:/Users/akumarmishr2/projects/petclinic-build/java-agent/opentelemetry-javaagent.jar -jar C:/Users/akumarmishr2/projects/petclinic-build/default/*.jar
elif [ "$PROFILE" == "mysql" ]; then
    C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary/bin/mysqld --initialize-insecure --user=mysql --datadir=C:/Users/akumarmishr2/projects/petclinic-build/mysql-data
    C:/Users/akumarmishr2/projects/petclinic-build/mysql-binary/bin/mysqld_safe --user=mysql &
    java -javaagent:C:/Users/akumarmishr2/projects/petclinic-build/java-agent/opentelemetry-javaagent.jar -jar C:/Users/akumarmishr2/projects/petclinic-build/mysql/*.jar --spring.profiles.active=mysql
else
    echo "Invalid profile. Use 'default' or 'mysql'."
fi

# Step 8: Save configuration
save_config

echo "Configuration and profile information saved to $CONFIG_FILE."
