import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<DelayedTask> dq=new DelayQueue<>();
        dq.put(new DelayedTask("Task 1", 5, TimeUnit.SECONDS));
        dq.put(new DelayedTask("Task 2", 2, TimeUnit.SECONDS));
        dq.put(new DelayedTask("Task 3", 10, TimeUnit.SECONDS));

        while(!dq.isEmpty()){
            DelayedTask task=dq.take();
            System.out.println("Executed task : "+task.getTaskName()+" at "+System.currentTimeMillis());
        }
    }
}

class DelayedTask implements Delayed{
    private final String taskName;
    private final long startTime;
    

    public DelayedTask(String taskName, long delayTime, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis()+unit.toMillis(delayTime);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remainingTime=startTime-System.currentTimeMillis();
        return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime<((DelayedTask)o).startTime){
            return -1;
        }
         if(this.startTime>((DelayedTask)o).startTime){
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}