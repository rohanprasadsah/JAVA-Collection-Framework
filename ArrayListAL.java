import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class MyComparator implements Comparator<String> {
//     @Override
//     public int compare(String o1, String o2) {
//         return o2.length()-o1.length();
//     }
// }

public class ArrayListAL {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pomegranate");
        list.add("Mango");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Guava");

        System.out.println(list);

        // Collections.sort(list);
        // list.sort((a,b)->a.length()-b.length());
        // list.sort(new MyComparator());
        Comparator<String> comp = Comparator.comparing(String::length).reversed().thenComparing(String::compareTo);
        list.sort(comp);
        System.out.println(list);
    }
}
