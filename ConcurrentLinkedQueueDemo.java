import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> clq=new ConcurrentLinkedQueue<>();

        Thread producer=new Thread(()->{
            try{
                System.out.println("Task adding in the queue...");
                clq.add("Task "+System.currentTimeMillis());
                System.out.println("Task added in the queue");
            }
            catch(Exception e){}
        });

        Thread consumer=new Thread(()->{
            try{
                Thread.sleep(1000);
                System.out.println("Retrieved task : "+clq.poll());
            }
            catch(Exception e){}
        });

        producer.start();
        consumer.start();
    }
}
