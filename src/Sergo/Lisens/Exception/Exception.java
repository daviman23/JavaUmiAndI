package Sergo.Lisens.Exception;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws MyException {
        Scanner a = new Scanner(System.in);

        while(true){
            int i = Integer.parseInt(a.nextLine());

            if(i != 0){
                throw new MyException("you lose");
            }
        }
    }
}
