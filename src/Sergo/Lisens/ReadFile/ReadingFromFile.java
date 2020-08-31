package Sergo.Lisens.ReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

       String sep = File.separator;
        /* String wer = sep + "Users" + sep + "daviman" + sep + "desktop" + sep + "test.rtf";
        File file = new File(wer);
        Scanner a = new Scanner(file);
        while(a.hasNextLine()){
            System.out.println(a.nextLine());
        }
        a.close();*/

        File z = new File("test2");

        Scanner b = new Scanner(z);
        String line = b.nextLine();
        String[] numbers = line.split(" ");

        System.out.println(Arrays.toString(numbers));

        b.close();
    }


}
