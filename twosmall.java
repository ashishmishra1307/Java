public class twosmall {

    static int secondsmallest(int a[]){
        int smallest = a[0] ;
        int ssmallest = Integer.MAX_VALUE;                                       // 1,2,3,4,5
        for(int i=0;i<a.length;i++){
            if(a[i] < smallest){   // 5<23 , ss=23,s=5,  <5 
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] !=smallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
    public static void main(String args[]){

        int a[] = {23,5,6,7,8,1};

        System.out.println(secondsmallest(a));

    }
    
}
