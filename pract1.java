class Adder{

     int add(int a,int b){
        return a*4;
    }
}

@Override    
class cube extends Adder {
     int add(int a,int b, int c){
        return a+b+c;
    }
}

class pract1{
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println(a.add(2,3));
        cube c = new Adder();
        System.out.println(c.add(2,3));
    }


}