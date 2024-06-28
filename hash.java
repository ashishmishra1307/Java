import java.util.*;

public class hash {
    public static void main(String args[]){

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Ashish",89);
        map.put("Karan",99);
        map.put("Rahul",15);

        System.out.println(map.get("Rahul"));
        System.out.println(map.getOrDefault("MAnisha", 78));
        
    }
    
}
