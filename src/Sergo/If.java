package Sergo;

import org.w3c.dom.ls.LSOutput;

public class If {
    public static void main(String[] args) {
        int i = 1;
        if (i==1){
            System.out.println("true");
        }
        else if(i> 0){
            System.out.println(i);
        }
        else{
            System.out.println("false");
        }
    }
}
