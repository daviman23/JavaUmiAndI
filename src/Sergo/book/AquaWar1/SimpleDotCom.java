package Sergo.book.AquaWar1;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String chekYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо ";
        for(int cell : locationCells){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result =  "Потопил";
        }
        System.out.println(result);
        return result;
    }

}
