package Umi.lisens;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write something");
        String string = s.nextLine();
        System.out.println("you write "+string);
    }
}
