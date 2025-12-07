import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> q=new SynchronousQueue<>();

        Thread producer=new Thread(()->{
            try{
                System.out.println("Producer is waiting to transfer");
                q.put("Hello ji !!");
                System.out.println("Producer has transferred the message");
            }
            catch(Exception e){}
        });
        
        Thread consumer=new Thread(()->{
            try{
                System.out.println("Consumer is waiting to receive");
                System.out.println("Consumer received : "+q.take());
            }
            catch(Exception e){}
        });
        
        System.out.println("Queue : "+q);

        producer.start();
        consumer.start();
    }
}
