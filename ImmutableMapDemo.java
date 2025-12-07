import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("Ram", 1);
        map1.put("Shyam", 2);
        map1.put("Krishn", 3);
        System.out.println("map1 : "+map1);
        map1.put("Ravi", 4);

        Map<String,Integer> map2=Collections.unmodifiableMap(map1);
        System.out.println("map2 : "+map2);
        // map2.put("Ravi", 4);    // throws UnsupportedOperationException

        // here we created a unmodifiable view of map1 i.e. map2 which we can't modify, but we can still modify map1 which we don't want that's why a new method was inroduced i.e. Map.of() in Java 9.
        Map<String,Integer> map3=Map.of("A", 1, "B", 2, "C", 3);
        System.out.println("map3 : "+map3);
        // map3.put("D", 4);   // throws UnsupportedOperationException

        // Map.of() -> Returns an unmodifiable map containing three mappings. See Unmodifiable Maps for details.But it has limitations that it can have only 10 key value pairs, that's why we use another method i.e. Map.ofEntries() which doesn't have these limitations i.e. it can have any number of key value pairs.
        Map<String,Integer> map4=Map.ofEntries(Map.entry("Vir", 89), Map.entry("Ravi", 95), Map.entry("Rohit", 68));
        System.out.println("map4 : "+map4);
        // map4.put("D", 4);   // throws UnsupportedOperationException
    }
}
