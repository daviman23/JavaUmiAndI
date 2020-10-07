package Sergo.Lisens.Lisens2.Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new work(i));}
        executorService.shutdown();
        System.out.println("all task submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class work implements Runnable{
    private int id;

    public work(int id){
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work" + id + " was completed");
    }
}
