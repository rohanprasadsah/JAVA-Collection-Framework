import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        //LinkedList acting as Queue.
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(10);  //EnQueue
        ll.addLast(20);  //EnQueue
        ll.addLast(30);  //EnQueue
        ll.addLast(40);  //EnQueue
        System.out.println(ll);
        ll.removeFirst();   //DeQueue
        System.out.println(ll);
        System.out.println(ll.getFirst());  //peek
        System.out.println(ll.peek());  //peek

        Queue<Integer> q=new LinkedList<>();
        q.offer(684);
        q.add(789);
        q.offer(78);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q);



        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        System.out.println(q1.remove());    //throws NoSuchElementException if queue is empty
        System.out.println(q1.poll());      //returns null if queue is empty
        // System.out.println(q1.element());   //throws NoSuchElementException if queue is empty
        System.out.println(q1.peek());      //returns null if queue is empty

        Queue<Integer> q2=new ArrayBlockingQueue<>(2);
        System.out.println(q2.add(22));
        System.out.println(q2.offer(23));
        // System.out.println(q2.add(24));    //throws IllegalStateException if queue is full.
        System.out.println(q2.offer(25));    //returns false if queue is full.
        System.out.println(q2);
    }
}
