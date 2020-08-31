package Sergo.Lisens.WritingToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("test123");
        PrintWriter pw = new PrintWriter(file1);

        pw.println("Hello");

        pw.close();
    }
}
