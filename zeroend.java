import java.util.*;
public class zeroend {


    public static void main(String args[]){

        int arr[] = {1,2,5,6,3,2,0,0,4};
        Arrays.sort(arr);

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }


    }
}
