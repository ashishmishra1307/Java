import java.util.*;

public class animals {

    public static void main(String args[]){
        Dog d = new Dog();
        Horse h = new Horse();
        h.no_legs(0);
        d.no_legs(0);
    }
   static class Animal{
        int legs;
        void no_legs(int legs){
        System.out.println(legs);
        }
    }
    
   static class Dog extends Animal {
        @Override
        void no_legs(int legs){
        System.out.println(4);       
        }   
    }

   static class Horse extends Animal {
        @Override
        void no_legs(int legs){
        System.out.println(19);       
        }   
    }
}
