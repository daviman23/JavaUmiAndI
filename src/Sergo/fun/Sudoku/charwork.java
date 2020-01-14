package Sergo.fun.Sudoku;

import java.util.Scanner;

public class charwork {
    public static void main(String[] args) {
        Scanner sudoku = new Scanner(System.in);
        int[] i = new int[9];
        for (int j = 0; j < i.length; j++) {
            i[j] = sudoku.nextInt();
        }
        int y = 0;
        int y1 = 0;
        while (y1 != 9) {
            while (y != 9) {
                if(i[y] == i[y1]){
                    y1--;
                }
                y++;
            }
            y1++;
        }
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }
}


