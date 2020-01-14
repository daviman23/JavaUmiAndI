package Sergo.fun.Sudoku;

import java.util.Scanner;

public class inTezt {
    public static void main(String[] args) {
        //ввод строк
        Scanner sudoku = new Scanner(System.in);
        String[] s = new String[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = sudoku.next();
        }
//приоброзоывние в массив
        char[][] c = new char[9][9];
        for (int i = 0; i < 9; i++) {
            String f = s[i];
            for (int j = 0; j < 9; j++) {
                c[j] = f.toCharArray();
            }
        }
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9; j++) {
                if(c[i][j] == '.') {
                    c[i][j] = '0';
                }
            }
        }
        int[][] in = new int[9][9];
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                char a = c[i][j];
                in[i][j] = Integer.parseInt(a +"");
            }
        }
        for (int i = 0; i < 9; i++) {
            int k = 0;
            for (int j = 0; j < 9; j++) {
               int a = in[i][j];
               int q = i;
                for (int l = 0; l < 9; l++) {
                    if(in[i][l] == 10){
                        in[i][l] = 1;
                    }
                    if(a == in[i][l]){
                        in[i][j] = in[i][j] + 1;
                    }

                }
            }
        }
        for (int i = 0;i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(in[i][j] + " ");
            }
            System.out.println();
        }
    }
}

