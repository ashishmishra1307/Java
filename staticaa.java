public class staticaa {

    public static void main(String args[]){

     animal ani = new animal();
     ani.haha();
    }
    
}// static can be access only by static methods, to access non staic, make the method as a static....
// non static methods can be accessed into static methods.

class animal {
    int legs;
    String name;

    static void greeting(){
        System.out.println("My name is haha");
        animal obj = new animal();
        obj.haha();
    }
    void haha(){
        //greeting();
        System.out.println("Done");
    }

    // void(){
    //     ashish()
    // }

}
