public class sort {

    static int bubble(int arr[],int x,int l,int r){

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; 
    }
        public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int target = 4;
        int start = arr[0];
        int end= arr.length-1;
        System.out.print(bubble(arr,target,start,end));
    }
}
