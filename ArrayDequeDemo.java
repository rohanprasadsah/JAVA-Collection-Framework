import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> ad=new ArrayDeque<>();
        ad.addFirst(10);
        ad.addLast(20);
        ad.offerFirst(5);
        ad.offerLast(25);
        System.out.println(ad);
        System.out.println("first element : "+ad.getFirst());
        System.out.println("last element : "+ad.getLast());
        ad.removeFirst();
        ad.pollLast();
        for(int x:ad){
            System.out.println(x);
        }
    }
}
