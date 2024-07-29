public class charat {
    public static void main(String args[]){

        String name = "ABCDEF";                                  // a, C , E
       // char ch = name.charAt(3);
        int count =0;
        for(int i = 0; i<name.length();i++ ){
            if(i % 2 == 0){
                count++;
                System.out.println(name.charAt(i));
            }
        }

        System.out.println(count);

    }
    
}
