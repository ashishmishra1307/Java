public class kadens {

    public static int[] mergesorted(int arr1[],int arr2[]){


        int mergearr[] = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        
        // [1,2,3,4,5,6,7,8,9]
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                mergearr[k++] =arr1[i++];
            }
        }

    }
    public static void main(String args[]){

        int num =5;
        int target = 6;
        int arr1[] ={1,2,3,4,5};
        int arr2[] = {6,7,8,9};

        int[] result = mergesorted(arr1,arr2);
         


        
    }
    
}
