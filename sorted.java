public class sorted {
    static boolean checksort(int a[]){
    for(int i=0;i<a.length-1;i++){
    if(a[i] > a[i+1]){
return false;
    }
    }
   return true;
}   
public static void main(String args[]){
        int a[] = {1,2,3,9};
        System.out.println(checksort(a));
    }
    
}
