import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> q1=new PriorityBlockingQueue<>(11);
        // BlockingQueue<String> q1=new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // put() requires handling InterruptedException because it's defined in BlockingQueue, even though PriorityBlockingQueue never blocks.
        q1.add("books");
        q1.add("pens");
        q1.add("ant");
        q1.add("toss");
        System.out.println("q1 : "+q1);
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
    }
}
