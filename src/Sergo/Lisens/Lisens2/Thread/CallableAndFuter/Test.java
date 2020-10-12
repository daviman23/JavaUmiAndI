package Sergo.Lisens.Lisens2.Thread.CallableAndFuter;

import java.util.Random;
import java.util.Timer;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            Thread.sleep(500);
            System.out.println("Finished");

            Random random = new Random();
            int randomeValue = random.nextInt(10);
            if(randomeValue <= 5){
                throw  new Exception("Something bad happened");
            }
            return randomeValue;
        });
        executorService.shutdown();

        try {
            int result = future.get(); // гет ждет пока поток кончится
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
