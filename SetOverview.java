import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(45);
        set.add(37);
        set.add(284);
        set.add(0);
        set.add(284);
        System.out.println(set);

        //Creating a thread safe or synchronized set using the method Collections.synchronizedSet(set);
        Set<Integer> set2=Collections.synchronizedSet(set);
        // However, using Collections.synchronizedSet() for thread safety is generally not recommended, because it adds significant synchronization overhead. If the underlying set is a TreeSet (backed by a Red-Black tree), the extra locking makes operations slower and increases complexity.
        //Instead, it's better to use ConcurrentSkipListSet, which provides thread safety without heavy locking.

        ConcurrentSkipListSet<Integer> set3=new ConcurrentSkipListSet<>();
        
    }
}
