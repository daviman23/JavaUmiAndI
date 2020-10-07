package Sergo.Lisens.Lisens2.Thread.volatil;

import java.util.Scanner;

public class Tets {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner s = new Scanner(System.in);
        s.nextLine();

        myThread.shutDown();
    }
}
class MyThread extends Thread{

    private volatile boolean running = true;
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void shutDown(){
        this.running = false;
    }
}
