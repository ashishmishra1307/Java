import java.util.*;

public class inheritance {

    public static void main(String args[]){
   // box rectangle = new box(3,4);
   // box cube = new box(3,4,5); 
    //area_rect rect = new area_rect(3,4);
    area_cube cube = new area_cube(5,4 , 2);
        }
}
class box {
    int l;
    int b;
    int h;

    box(int l,int b, int h){
        int area = l * b * h;
       // System.out.println(area);
    }
}

class area_rect extends box{
    area_rect(int l,int b){ 
    super( l,b,1);
    int area = l*b; 
    System.out.println(area);
      
    }
}

class area_cube extends box {
       
    area_cube(int l,int b, int h)
    {
        super(l,b,h);
        int area = l * b * h;
        System.out.println(area);
    }
}

