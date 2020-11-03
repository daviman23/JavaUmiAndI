package Sergo.book.MyAquaWar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHekper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLine = is.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(inputLine.length() == 0){
            return null;
        }
        return  inputLine;
    }
}
