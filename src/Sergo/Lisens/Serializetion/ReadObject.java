package Sergo.Lisens.Serializetion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReadObject {
    public static void main(String[] args)  {
        Person person1 = new Person(1,"Bob");
        Person person2 = new Person(2, "Mike");

        try {
            FileOutputStream fps = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fps);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
