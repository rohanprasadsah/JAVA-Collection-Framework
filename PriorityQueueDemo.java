import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(15);
        q.add(10);
        q.add(30);
        q.add(5);
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        // internal working - PriorityQueue is implemented as a min-heap by default (for natural ordering)
    }
}
