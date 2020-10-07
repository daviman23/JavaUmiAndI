package Sergo.Lisens.Lisens2.Itarble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        while(iterator.hasNext()){
            System.out.println(iterator.next());

            if(idx == 1)
                iterator.remove();

            idx++;
        }

        for(int x : list){    //в   for нельзя идити по листу и удолять одновремеено
            System.out.println(x);
        }
    }
}
