package Sergo.fun.Sudoku;

import java.util.Scanner;

public class inTezt {
    public static void main(String[] args) {
        //ввод строк
        Scanner sudoku = new Scanner(System.in);
        String []s = new String[9];
        for (int i = 0; i < s.length ; i++) {
            s[i] = sudoku.next();
        }
//приоброзоывние в массив
        char [][] c = new char[9][9];
        for (int i = 0; i < 9 ; i++) {
            String f = s[i];
            for (int j = 0; j < 9; j++) {
                c[j] = f.toCharArray();
            }
            System.out.println();

        }
        for (int i = 0; i < 9 ; i++) {
            int t = 0;
            for (int j = 0; j < 9 ; j++) {
                if(t <= 8){
                    char a = c[i][j];
                    char b = c[i][t];
                    if(c[i][j] == c[i][t]) {
                        c[i][j]++;
                        System.out.print(c[i][j] + " ");
                        t++;
                    }
                    else if(c[i][j] != c[i][t]) {
                        t++;
                    }
                }

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length ; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
            }
        }
}
