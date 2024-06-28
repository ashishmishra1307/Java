public class larget {
    public static void main(String[] args) {
        int arr[] = {12,3,7,4,2,99};

        int largest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
    
}
