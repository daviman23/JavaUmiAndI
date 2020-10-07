package Sergo.Lisens.Lisens2.Thread.Semafor;

import java.util.concurrent.Semaphore;

public class Tets {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println(" All parmits have been aquired");

            semaphore.acquire();
            System.out.println("Cant reach hear....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      //  semaphore.release();

        System.out.println(semaphore.availablePermits());
    }
}
