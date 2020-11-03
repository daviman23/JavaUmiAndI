package Sergo.book.MyAquaWar;

import Sergo.book.AquaWar1.GameHelper;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class SimpleDotCom {
    int[] locationCell;
    int numOfHits = 0;

    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper gm = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int random = (int) (Math.random() * 5);

        int[] location = {random, random + 1, random + 2};
        theDotCom.setLocationCell(location);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = gm.getUserInput("Введите число");
            String result = theDotCom.ChekYourSelf(guess);
            numOfGuess++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам понадобилось " + numOfGuess + " попытки");
            }
        }
    };

    public void setLocationCell(int[] location) {
        this.locationCell = location;
    }

    public String ChekYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCell){
            if(guess == cell) {
                numOfHits++;
                result = "Попал";
                break;
            }
        }
        if(numOfHits == locationCell.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
