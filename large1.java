public class large1 {
    public static int bubble(int arr[],int start,int last,int target){
        while(start <= last){
            int mid = (start+last)/2;

            if(arr[mid] ==target){
                return mid;
            }
            else if(arr[mid] > target){
                last = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
            return -1;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,5,6};
        int start = 0;
        int last = arr.length-1;
        int target = 5;
        System.out.println(bubble(arr,start,last,target));
        
    }
    
}
