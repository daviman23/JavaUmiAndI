package Sergo.Lisens.Lisens2.Thread.Semafor;

import java.util.concurrent.*;

public class Tets {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Conection conection = Conection.getConection();
        for (int i = 0; i < 200 ; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        conection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
// singlton
class Conection{
    private static Conection conection = new Conection();
    private int conectioncount;
    private Semaphore semaphore = new Semaphore(10);

    private Conection() {

    }

    public static Conection getConection() {
        return conection;
    }
    public  void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
        conectioncount++;
            System.out.println(conectioncount);
    }
    Thread.sleep(5000);
        synchronized (this){
            conectioncount--;
        }
    }
}
