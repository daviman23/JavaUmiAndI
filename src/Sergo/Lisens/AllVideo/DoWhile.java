package Sergo.Lisens.AllVideo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int i;
       do{
           System.out.println("введи 5 ");
           i = scanner.nextInt();
       }while (i != 5);
        System.out.println("вы ввели пять ");
    }
}
