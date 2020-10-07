package Sergo.Lisens.Lisens2.Thread.Consumer;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Test {
   static BlockingQueue<Integer> Queue = new ArrayBlockingQueue(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
    }
    private static void produce() throws InterruptedException {
        Random random = new Random();
        while (true){
            Queue.put(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {
        Random random = new Random();
        while (true){
            Thread.sleep(100);

            if(random.nextInt(10) == 5) {
                System.out.println(Queue.take());
                System.out.println("Queue size is " + Queue.size());
            }
        }
    }
}
