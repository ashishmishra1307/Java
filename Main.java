class Animal {
     void sound(){
        System.out.println("Animal sound");
    }
}

    class Dog extends Animal{
        @Override
        void sound(){
        System.out.println("Dog");
        }
    }
public class Main{
public static void main(String args[]){
    Animal a1 = new Animal();
  //  Animal();
      a1.sound();

      Animal D1 = new Dog();
      D1.sound();

      Dog d2 = new Dog();
      d2.sound();





}
}
