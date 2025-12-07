import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Vector<Integer> v=new Vector<>(3);
        // v.add(1);
        // v.add(2);
        // v.add(3);
        // System.out.println(v.capacity());
        // v.add(4);
        // System.out.println(v.capacity());

        // Vector<Integer> v2=new Vector<>(3,2);
        // v2.add(1);
        // v2.add(2);
        // v2.add(3);
        // System.out.println(v2.capacity());
        // v2.add(4);
        // System.out.println(v2.capacity());
        // v2.add(5);
        // v2.add(6);
        // System.out.println(v2.capacity());

        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Vector<Integer> v3=new Vector<>(l);
        for(int i=0;i<v3.size();i++){
            System.out.println(v3.get(i));
        }
    }
}
