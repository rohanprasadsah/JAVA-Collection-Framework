import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<>();
        map.put(3,"Ravi");
        map.put(2,"Shyam");
        map.put(4, "Krishn");
        map.put(1,"Ram");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(2));
        System.out.println(map.tailMap(2));
    }
}
