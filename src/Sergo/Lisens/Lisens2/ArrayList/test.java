package Sergo.Lisens.Lisens2.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
            List.add(i);
        }
        System.out.println(List);

        System.out.println(List.get(0));
        System.out.println(List.get(9));

        System.out.println(List.size());

        for (int i = 0; i < List.size() ; i++) {
            System.out.println(List.get(i));
        }
        List.remove(5);
        for(Integer x : List){
            System.out.println(x);
        }
        //Мы проводим много удалений
        List = new LinkedList<>(); // переводим лист арэй в линкед лист
    }
}
