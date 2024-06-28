public class javam {

    public static void main(String args[]){
        String str = "Ashish";

        //System.out.println(str.charAt(2));

        for(int i=0;i<str.length()-1;i++){
            for(int j=1;j<str.length()-1;j++){
            if(str.charAt(i) == str.charAt(j)){
                System.out.println(i);
                break;
            }
        }

    }
    
}}
