import java.util.HashSet;
import java.util.*;

public class union {
    public static void main(String args[]){


        int arr1[] = {1,5,2,4,5,3,6,2};
        int arr2[] = {5,2,4,1,5,2,1,7};

        Set<Integer> obj = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            obj.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            obj.add(arr2[i]);
        }

        System.out.println(obj);
        }


    }