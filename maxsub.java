import java.util.*;

public class maxsub {
    public static void main(String args[]){
        int maxi = Integer.MIN_VALUE;
        int arr[] = {1,2,3,4,5,67,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            maxi = Math.max(maxi,sum);
        }
        System.out.println(maxi);

    }
    
}
