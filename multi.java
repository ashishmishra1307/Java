public class multi {

    public static void main(String args[]){
        Dog d = new Dog();

    }
    
    static class Animal{
        int legs;

        void no_oflegs(int legs){
        System.out.println(legs);
        }
    }

   static class Dog extends Animal{
    String s = "Black";
    void no_oflegss(String s){
        System.out.println(s);
    }
    }

    static class Cat extends Dog {

    }
}
