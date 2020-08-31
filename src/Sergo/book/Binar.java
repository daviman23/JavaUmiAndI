package Sergo.book;

import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {
        int[] ix = new int[32];
        int u = 0;
        int exit = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите чяисло:");
        int i = s.nextInt();
        while (i != 0) {
            if (i % 2 == 1) {
                exit = i / 2;
                ix[u] = 1;
            }
            if (i % 2 == 0) {
                exit = i / 2;
                ix[u] = 0;
            }
            i = exit;
            u++;
        }
        System.out.println("В двоичном коде будет:");
        int j = ix.length;
        while (j >= 0) {
            if (j <= u -1) {
                System.out.print(ix[j]);
            }
            j--;
        }
    }
}