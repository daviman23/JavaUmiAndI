package Sergo.book.MyAquaWar;

public class SimpleDotTestDriveCom {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] location = {3,4,5};
        dot.setLocationCells(location);
        String s = "3";
        String resulrt = dot.ChekYourSelf(s);
        System.out.println(resulrt);
    }
}
