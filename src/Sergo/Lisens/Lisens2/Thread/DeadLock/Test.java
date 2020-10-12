package Sergo.Lisens.Lisens2.Thread.DeadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner{
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLoks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;
        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i < 10000 ; i++) {
            takeLoks(lock1,lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));}
            finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void secondThread(){
        Random random = new Random();
        for (int i = 0; i < 10000 ; i++) {
            takeLoks(lock2,lock1);
            try{
                Account.transfer(account2, account1, random.nextInt(100));
            }finally {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }
    public void finished(){
        System.out.println(account1.getBalsnce());
        System.out.println(account2.getBalsnce());
        System.out.println("Total balance: " + (account1.getBalsnce() + account2.getBalsnce()));
    }
}

class Account{
    private int balsnce = 10000;
    private void depozit(int amount){
        balsnce += amount; // balsnce = balsnce + amount;
    }
    private void withdraw(int amount){
        balsnce -= amount;
    }
    public int getBalsnce() {
        return balsnce;
    }
    public static void transfer(Account ac1, Account ac2, int amount){
        ac1.withdraw(amount);
        ac2.depozit(amount);
    }
}

