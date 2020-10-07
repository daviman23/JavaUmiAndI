package Sergo.Lisens.Lisens2.Thread.MorePotok;

public class Tets {
    public static void main(String[] args) throws InterruptedException {
        // Mythread mythread = new Mythread();
        // mythread.start();

        // Mythread mythread2 = new Mythread();
        // mythread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
        // System.out.println("Im going to sleep");
        // Thread.sleep(3000);
        // System.out.println("Im awake!");
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            System.out .println("Hello from Runner" + i);
        }
    }
}
class Mythread extends Thread{
    public void run(){
        for (int i = 0; i < 1000 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}
