import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class multiThreadingDemo{

public static int counter=0;
public static AtomicInteger atomicCounter = new AtomicInteger();
private static Lock lock = new ReentrantLock();


public static void main (String[] args) throws InterruptedException, ExecutionException{
    ExecutorService executor = Executors.newFixedThreadPool(4);
    //increment counter with synchronization//
    Runnable syncTask = () ->{
        synchronized(multiThreadingDemo.class){
            counter++;
        }
       
    };
    //incrment atomic counter thread-safe without locks//
    Runnable atomicTask =() -> atomicCounter.incrementAndGet();
    //use reetrantlock for explicit locking//
    Runnable lockTask =()-> {
        lock.lock();
        try{
            counter++;
        }finally{
            lock.unlock();
        }
    };
    //submit tasks to the executor//
    for(int i=0;i<100;i++){
        executor.submit(syncTask);
        executor.submit(atomicTask);
        executor.submit(lockTask);
    }
    //shutdown and wait for tasks to finish //
    executor.shutdown();
    executor.awaitTermination(10, TimeUnit.SECONDS);

    //usage of callable and future
    Callable<String>calableTask=()-> "Result from "+Thread.currentThread().getName();
    Future<String> futureTask=executor.submit(calableTask);
    System.out.println(futureTask.get());



}

}