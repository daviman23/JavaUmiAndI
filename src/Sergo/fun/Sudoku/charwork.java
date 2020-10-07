package Sergo.fun.Sudoku;

import java.util.Scanner;

public class charwork {
    public static void main(String[] args) {
        int[] i = new int[10];
        for (int j = 0; j < 3; j++) {
            i[j] = j;
        }
        for (int j = 4; j < 8 ; j++) {
            i[j] = j+2;
        }
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }

    public void sort(int i){

    }
}