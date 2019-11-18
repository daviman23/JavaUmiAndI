package Sergo;

import java.util.Scanner;

public class Sastantua{
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            int t = a.nextInt();
            ter(t);
        }
        public static int ter(int i) {
            int r = i;
            int max = i;
            int e = i - 1;
            int x = 3;
            int y = 7;
            int v = 4;
            if (i >= 2) {
                y = 19;
            }
            while (i != 0) {  // make line
                if (i > 1) {
                    x = x + v;
                    v++;}
                i--;}
            if (i >= 4) {
                x = x - e;}
            int zu = 6;
            while (i <= r) {// make column
                if ( i == 1){
                    y = 7;}
                if ( i == 2){
                    y = y + 12;}
                if (i == 3){
                    y = 33;}
                if ( i >= 4 && i % 2 == 0){
                    y = y + 12 + zu;
                    zu = zu + 2;}
                if(i >= 5 && i % 2 != 0){
                    y = y + 12 + zu;
                    zu = zu + 4;}
                i++;}
            char[][] tower;
            tower = new char[x][y];
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    tower[j][k] = ' ';}
            }
            int yMid = y / 2;
            int n = 1;
            int q = 3;
            int w = 4;
            int mn = 18;
            int yu = 1;
            int op = 1;
            for (int j = 0; j != x; j++) {
                if( j == q){
                    q = j + w;
                    n = n + 2;
                    w++;}
                for (int k = 0; k < y; k++) {
                    int yMid2 = y/2 + n;
                    int yMid1 = y/2 - n;
                    if (j >= 12){
                        yMid1 = yMid1 - yu;
                        yMid2 = yMid2 + yu;
                        if( j == mn){           // transition
                            if (yu % 2 == 0){
                                yu++;}
                            if (yu % 2 != 0) {
                                yu++;}
                            mn = mn + 6 + op;
                            op++;}}
                    if ( k == yMid1 + 1) {
                        while( k > yMid1 && k < yMid2) {
                            tower[j][k] = '*';
                            k++;}
                    }
                    if ( j >= 0 && k == yMid1){
                        while( yMid1 <= yMid){
                            tower[j][k] = '/';
                            yMid1++;}
                    }
                    if ( j >= 0 && k == yMid2){
                        while( yMid2 >= yMid){
                            tower[j][k] = '\\';
                            yMid2--;}
                    }
                }
                n++;
            }
            for (int j = x - max; j < x; j++) {      // door
                for (int k = yMid - max; k < y; k++) {
                    while( k > yMid - max + max/2 && k < yMid + max - max/2) {
                        if(j == x - max/2 - 1 && j >= 10 && j % 2 == 0 && k == yMid + max/2 - 1){
                            tower[j][k] = '$';
                            break; }
                        if(j == x - max/2 - 1 && j >= 10 && j % 2 != 0 && k == yMid + max/2 - 2){
                            tower[j][k] = '$';
                            break;}
                        tower[j][k] = '|';
                        k++;
                    }
                }
            }
            for (int j = 0; j < x; j++) {      // print
                for (int k = 0; k < y; k++) {
                    System.out.print(tower[j][k]);}
                System.out.println();
            }
            return (x);
        }
    }
