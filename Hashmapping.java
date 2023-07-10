import java.util.*;
public class Hashmapping {
    public static void main(String arg[]){
        HashMap<String,Integer> hm = new HashMap<>();

        //insertion
        hm.put("India",120);
        hm.put("US",30);
        hm.put("China",140);

        System.out.println(hm);//unordered 

        //update value if exist
        hm.put("China",150);
        System.out.println(hm); 

        //search or lookup
        if(hm.containsKey("China"))
        System.out.println("Present in map");
        else
        System.out.println("Key is not preseent in map");

        System.out.println(hm.get("China"));//exist
        System.out.println(hm.get("Africa"));//not exist

        // //iteration
        
        // for(Map.Entry<String,Integer> e : hm.entrySet()){
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }
        
        //to get only keys of hashmap by keyset

        Set<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key + " " + hm.get(key));
        }
    }
}
