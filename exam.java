public class exam {
    public static boolean checksort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,45,9};
        System.out.print(checksort(arr));
    }
}
    
