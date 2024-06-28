import java.util.*;
java.util.Collections;
public class zerend {
    public static void main(String args[]){

        int arr[] = {1,2,5,6,3,2,0,0,4};
        int j = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j=i ;
            }
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i] != 0){
                swap(arr[i],arr[j]);
                j++;
            }
        }


    }
    
}
