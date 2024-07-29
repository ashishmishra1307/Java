import java.util.*;

public class first {
    public static void main(String args[]){
        String str = "Ashish";
        int count=0;

     //   char start = str.charAt(0);
     //   System.out.println(start);
     //   char last = str.charAt(str.length()-1);
     //   System.out.println(last);

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for(int i=0;i<str.length()-1;i++){
            System.out.println(str.charAt(key));
            break;
        }

        for(int i=0;i<str.length()-1;i++){

            if(str.charAt(i) == 's'){
                count++;
            }
        }
        System.out.println("Frequency of s is " + count);

        String replacable = str.replace('s','e');
        System.out.println(replacable);
    }
    
}
