import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ImmutableSetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println("set : "+set);

        Set<Integer> immutableSet=Collections.unmodifiableSet(set);
        System.out.println("immutableSet : "+immutableSet);
        // immutableSet.add(5);    //throws UnsupportedOperationException
        
        Set<Integer> immutableSet2=Set.of(4,5,7,9,1);
        System.out.println("immutableSet2 : "+immutableSet2);
        // immutableSet2.add(578);    //throws UnsupportedOperationException

        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(56);
        ts.add(78);
        ts.add(34);
        ts.add(12);
        System.out.println("ts : "+ts);

        Set<Integer> immutableSet3=Set.copyOf(ts);
        System.out.println("immutableSet3 : "+immutableSet3);
        // immutableSet3.add(45);      //throws UnsupportedOperationException
    }
}
