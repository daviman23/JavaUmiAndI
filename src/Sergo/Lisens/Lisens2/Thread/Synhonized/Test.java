package Sergo.Lisens.Lisens2.Thread.Synhonized;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Test test = new Test();
        test.doWork();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    /*
    1: 100 -> 101-> 101
    2: 100 ->
     */
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    /*public synchronized void increment(){
        counter++;
    }*/
    Object lock1 = new Object();
    Object lock2 = new Object();

    public void increment() {     //синхронизация на конекретны обьект
        synchronized (this) {
            counter++;
        }
    }
}