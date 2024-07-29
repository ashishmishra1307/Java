class  Animal{
     int legs(int a){
        return a;
    }
}

class Dog extends Animal{
     float legs(float a){
        return a;
    }
}

class overriding {
    public static void main(String args[]){
        Animal d1 = new Dog();
      //  d1.legs(1,5);
        System.out.println(d1.legs(1));
        System.out.println(d1.legs(1));
    }
}