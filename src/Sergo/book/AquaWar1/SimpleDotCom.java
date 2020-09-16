package Sergo.book.AquaWar1;

public class SimpleDotCom {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper halper= new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randmNum = (int)(Math.random() * 5);

        int[] location = {randmNum, randmNum+1, randmNum+2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;

        while (isAlive == true){
            String guess = halper.getUserInput("Введите число");
            String result = theDotCom.chekYourself(guess);
            numOfGuesses++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
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
