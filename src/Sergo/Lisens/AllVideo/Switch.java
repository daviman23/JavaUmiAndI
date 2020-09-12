package Sergo.Lisens.AllVideo;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты в школе");
                break;
            case 18:
                System.out.println("ты закончил");
                break;
            default:
                System.out.println("false");
        }
    }
}
