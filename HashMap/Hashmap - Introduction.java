import java.util.HashMap;

public class Main{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        System.out.println(hm);
        // add an ele
        hm.put("India",200);
        hm.put("China",190);
        hm.put("Uk",170);
        hm.put("USA",110);
        System.out.println(hm);
        // update a value
        hm.put("India",150);
        System.out.println(hm);
        
    }
}