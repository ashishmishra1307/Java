public class vowels {

    public static void main(String agrs[]){

        String str = "aeiou";
        String s = "";
        int count =0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
        
            if(c =='a' || c == 'e' || c == 'i' || c == 'o'|| c =='u'){
                count++;
                s = s + c;
            }
        }
        System.out.println(count);
        System.out.println(s);
    }
    
}
