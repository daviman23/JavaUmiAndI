package Sergo.Lisens.Lisens2.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // hand -> [1] -> [2] -> [3] -> [4]
        List<Integer> arrayList = new ArrayList<>();
        /* [7][1][2][3][4][5][6]
               ------------> */
        measureTime(linkedList);
        measureTime(arrayList);
    }
    public static void measureTime (List<Integer> list){


        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000 ; i++) {
            list.add(0 ,i);
        }

        /*for (int i = 0; i < 100000 ; i++) {
            list.get(i);    //long realization for linkedList
        }*/
        long end = System.currentTimeMillis();
        System.out.println(list.get(99998));
        System.out.println(end - start);
        System.out.println(list.size());
    }
}
