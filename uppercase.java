public class uppercase {
    public static void main(String args[]){

        String str = "Hi,my name is ASHISH";
        int count =0;
        int countl =0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
            if(Character.isLowerCase(c)){
            countl++;
            }
        }
        System.out.println("Count of uppercase " + count);
        System.out.println("count of lowercase " + countl);



    }
    
}
