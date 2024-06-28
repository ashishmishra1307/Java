import javax.swing.plaf.synth.SynthStyleFactory;

public class inn {
    
    public static void main(String args[]){

    child ashish = new child();
    ashish.legs();
    }
}

class Human{
   int legs =2;
   String colour_eyes;
   int age;
}

class child extends Human{
//int legs;
    void legs(){ 
    System.out.println("Ashish has no of legs = " + legs);        // legs are inherited from human...
    }

}


//     void legs(){
//         System.out.println("Ashish has no of legs = " + legs);
//     }
// }