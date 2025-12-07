import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map=new TreeMap<>();
        map.put(3, "ravi");
        map.put(1, "bheem");
        map.put(5, "ram");
        map.put(4, "vir");

        System.out.println(map);
        System.out.println(map.ceilingKey(2));
        System.out.println(map.lowerKey(8));
        System.out.println(map.higherEntry(4));
        System.out.println(map.descendingMap());
    }
}
