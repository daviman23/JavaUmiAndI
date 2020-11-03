package Sergo.book.MyAquaWar;

import Sergo.book.AquaWar1.GameHelper;

public class SimpleDotCom {
    public static void main(String[] args) {
       int  numOfGuess = 0;
        GameHelper gm = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int random =(int)(Math.random() * 5);

        int[] location = {random,random+1,random + 2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;

        while (isAlive == true){
            String guess = gm.getUserInput("Введите число");
            String result = theDotCom.ChekYourSelf(guess);
            numOfGuess++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам понадобилось " + numOfGuess + " попытки");
            }
        }
    }
    int[] locationCells;
    int numOfHeats = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String ChekYourSelf(String StringGuess){
        String result = "Мимо";
        int i = Integer.parseInt(StringGuess);

        for(int  call : locationCells){
            if(i == call){
                result = "Попал";
                numOfHeats++;
                break;
            }
        }
        if(numOfHeats == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
