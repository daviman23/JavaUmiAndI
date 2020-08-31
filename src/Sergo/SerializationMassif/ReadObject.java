package Sergo.SerializationMassif;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;

public class ReadObject {
    private static Object Person;

    public static void main(String[] args)  {

        Person[] people = {new Person(1,"bob"),new Person(2,"Mike"), new Person(3,"Tom")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            /*oos.writeInt(people.length);

            for(Person person : people){
                oos.writeObject(person);
            }*/
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
