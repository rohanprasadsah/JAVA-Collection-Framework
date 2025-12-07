import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        // for(int x:l){
        //     System.out.println(x);
        // }

        // Iterator<Integer> i=l.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // for(int x:l){
        //     if(x%2==0){
        //         l.remove(x);     //throws ConcurrentModificationException
        //     }
        // }

        
        Iterator<Integer> i=l.iterator();
        while (i.hasNext()) {
            int x=i.next();
            if(x%2==0){
                i.remove();
            }
            else{
                System.out.println(x);
            }
        }
    }
}
