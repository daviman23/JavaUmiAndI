package Sergo.book.AquaWar2;

public class SimpleDotCom {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper halper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int location[] = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;

        while (isAlive = true){
            String guess = halper.getUserInput(" Введите число");
            String result = theDotCom.chekYourself(guess);
            numOfGuess++;

            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuess + " попыток(и)");
            }
        }

    }

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        this.locationCells = locs;
    }

    public String chekYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for(int cell : locationCells){
            if(guess == cell){
                result = "Папал" ;
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
