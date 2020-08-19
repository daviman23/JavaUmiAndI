package Umi.Funn;


import java.util.Scanner;

public class DontTouch {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);
        System.out.println("Wright anything and be right in your word (it happens in the winter)");
        String str = q.nextLine();
        while (!str.equals("snow")){
            System.out.println("bla-bla-bla");
            str = q.nextLine();
        }
        System.out.println("good job");
        System.out.println("im saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad");

}
}
