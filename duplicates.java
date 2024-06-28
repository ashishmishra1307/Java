import java.util.*;
public class duplicates {
    public static void main(String args[]){

        int arr[] = {1,2,3,2,3,1,4};
        Set<Integer> obj = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            obj.add(arr[i]);
        }

        // int index =0;

        // for(auto it : obj){
        //     arr[index]= it;
        //     index++;

        //for(int i=0;i<arr.length;i++){
            System.out.println(obj);
       // }
        }
    }
