package Sergo.Lisens.Lisens2.Thread.WaitAndNotify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
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
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started..");
            wait(); //1 - отдаем intrinsic lock чтобы другие потоки могли забрать обьект 2 - ждем пока будет вызван notify
            System.out.println("Producer Thread resumed..");
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();

            Thread.sleep(5000);
        }
    }
}
