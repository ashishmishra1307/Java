public class ideal {

    public static void longestIdealString(String s, int k) {
        char[] obj = s.toCharArray();
        char[] t= new char[obj.length];
        for(int i=0;i<obj.length-1;i++){
            if(obj[i] - obj[i+1] < k ){
            obj[i] = t[i];
            }
        }
        System.out.print("element " + t[2]);
    }
    public static void main(String args[]){

        String s = "acfgbd";
        int k= 2;

        longestIdealString(s,k);

    }}



