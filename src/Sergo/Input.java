package Sergo;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       // String s = new String("dfgh");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите что нибудь");
        String s = sc.nextLine();
        System.out.println("вы ввели " + s);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите чисмло");
        int i = in.nextInt();
        System.out.println("вы ввели число " + i);
    }
}
