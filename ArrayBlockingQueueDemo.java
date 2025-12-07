import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> q=new ArrayBlockingQueue<>(3);
        Thread producer=new Thread(new Producer(q));
        Thread consumer=new Thread(new Consumer(q));
        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable{
    private BlockingQueue<Integer> bq;
    private int val;
    public Producer(BlockingQueue<Integer> bq){
        this.bq=bq;
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Producer produced : "+val);
                bq.put(val++);
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Producer Exception");
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> bq;
    public Consumer(BlockingQueue<Integer> bq){
        this.bq=bq;
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Consumer consumed : "+bq.take());
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println("Consumer Exception");
            }
        }
    }
}