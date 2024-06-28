import javax.sql.rowset.spi.SyncResolver;

public class polymorphism {

    public static void main(String args[]){

    }
    
}

class Shapes{
    void area(){
 System.out.println("I am in shapes");
}
}

class circle extends Shapes{

}

class triangle extends Shapes{

} 

class square extends Shapes{

}