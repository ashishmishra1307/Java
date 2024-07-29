// Method overloading means when we have different different fucntion with same methods name and different parameters.
// like here we are having add with 2 and 3 parameters so that it can be easy for us to get addition rather than having different function name.


class overloader{
    static int add(int a,int b) 
    {return a+b;}

    static int add(int a,int b, int c) 
    { return a+b+c;}

} 
public class overloading {

    public static void main(String args[]){

        System.out.println(overloader.add(1,2));
        System.out.println(overloader.add(1,2,3));


    }
    
}
