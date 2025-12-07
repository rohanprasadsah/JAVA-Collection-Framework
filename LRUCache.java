import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    //LRU=Least Recently Used

    private int capacity;

    LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> map = new LRUCache<>(3);
        map.put("Ram",8);
        map.put("Shyam",9);
        map.put("Vir",10);

        map.get("Ram");

        map.put("Ravi",11);

        // map.get("Ram");

        System.out.println(map);
    }
}
