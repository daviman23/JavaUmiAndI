package Sergo.Lisens.Enum;

public class Test {
    public static void main(String[] args) {
        /*Animal animal = Animal.CAT;
        System.out.println(animal.getTransletion());
        switch (animal){
            case CAT:
                System.out.println("IT's a cat!");
                break;
            case DOG:
                System.out.println("It's a Dog!");
                break;
            }
            Season summer = Season.SUMMER;
        switch (summer){
            case SUMMER:
                System.out.println("It's warm outside");
                break;}*/
        //Season season =Season.WINTER;
       // System.out.println(season.getTemperature());
        Season season = Season.WINTER;
        System.out.println(season.name());
        System.out.println(season.ordinal());
        }

    }
