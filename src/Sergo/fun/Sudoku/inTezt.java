package Sergo.fun.Sudoku;

import java.util.Scanner;

public class inTezt {
    public static void main(String[] args) {
        Scanner sudoku = new Scanner(System.in);

        char [][] s = new char[9][9];
       /* for (int i = 0; i < s.length ; i++) {
            s[i] = sudoku.nextInt();
            System.out.println(s[i]);
        }*/
        for (int i = 0; i < s.length ; i++) {
            System.out.println();
            for (int j = 0; j < s.length ; j++) {
                s[i][j] = '.';
                System.out.print(s[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < 9 ; i++) {
            System.out.println();
            for (int j = 0; j < 9 ; j++) {
                if(s[i][j] > '0' && s[i][j] <= '9'){
                    System.out.print(s[i][j]);
                }
                else if( s[i][j] == '.'){
                    System.out.print(s[i][j]);
                }
                else
                    return;
            }
        }

    }
}

class test{

}
