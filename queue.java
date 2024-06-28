public class queue {
    static void missing(int a[]){
        for(int i=1;i<=a.length;i++){
            int flag =0;
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    flag = 1;
                    break;
                }
            }
              if(flag ==0){
                 System.out.println(i);
            }
        }
        //return 0;
    }
    public static void main(String args[]){
        int a[] = {3,2,4,6,2,1};
        missing(a);     

    }
    
}
