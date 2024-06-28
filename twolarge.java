public class twolarge {
    public static int secondlarge(int a[]){
        int largest = a[0];
        int slargest = -1;

        for(int i=0;i<a.length;i++){
            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
                }
        
        else if(a[i] < largest ){
            slargest = a[i];
        }
    }
    return slargest;

}
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8};

        System.out.println(secondlarge(a));

    }
}
