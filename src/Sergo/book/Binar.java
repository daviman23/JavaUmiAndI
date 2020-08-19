package Sergo.book;

public class Binar {
    public static void main(String[] args) {
        int [] aa;
        aa = new int [10];
        int a = 62;
        int m = 0;
        int i = 0;
        while (a != 0) {
            if (a % 2 != 1) {
                a = a / 2;
                //System.out.print("0");
                m = 0;
                aa[i] = m;
                i++;

            } else if (a % 2 != 0) {
                a = a / 2;
                //System.out.print("1");
                m = 1;
                aa[i] = m;
                i++;
            }
        }
        while(i != 0) {
            System.out.print(aa[i]);
            i--;
        }
    }
}
