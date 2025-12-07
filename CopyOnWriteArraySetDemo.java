import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        Set<Integer> csls=new ConcurrentSkipListSet<>();
        Set<Integer> cowas=new CopyOnWriteArraySet<>();

        for(int i=0;i<5;i++){
            csls.add(i);
            cowas.add(i);
        }
        System.out.println("csls : "+csls);
        System.out.println("cowas : "+cowas);
        
        System.out.println("Iterating and modifying CopyOnWriteArraySet...");
        for(int x:cowas){
            System.out.println(x);
            cowas.add(55);
        }
        System.out.println("cowas : "+cowas);
        
        // ConcurrentSkipListSet provides a weakly consistent iterator. It allows modifying the set during iteration without throwing ConcurrentModificationException. New elements (like 55, 89) may or may not appear in the current iteration, but will exist in the set afterward.

        System.out.println("Iterating and modifying ConcurrentSkipListSet...");
        for(int x:csls){
            System.out.println(x);
            csls.add(55);
            if(x==55){
                csls.add(89);
            }
        }
        System.out.println("csls : "+csls);
    }
}
