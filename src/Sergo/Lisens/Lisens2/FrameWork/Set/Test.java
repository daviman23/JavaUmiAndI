package Sergo.Lisens.Lisens2.FrameWork.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Mike");
        hashSet.add("Sergo");
        hashSet.add("Umi");
        hashSet.add("Maeve");
        hashSet.add("Tony");
        hashSet.add("Tony");//эти две ставки игнорирует компилято в сет нельзя вставл]ть дубликаты
        hashSet.add("Tony");

        /*for(String name : hashSet){
            System.out.println(name);
        }
        System.out.println(hashSet);// так тоже можно выводить

        System.out.println(hashSet.contains("Tony"));
        System.out.println(hashSet.contains("Dave"));

        System.out.println(hashSet.isEmpty()); // проверка на наличие чего дибо в сете если фолс значит там чтото есть
         */
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);

        System.out.println(union);

        // intersectoin  - пересечение множеств

        Set<Integer> intersectoin = new HashSet<>(hashSet1);
        intersectoin.retainAll(hashSet2);

        System.out.println(intersectoin);

        //разность множеств difference

        Set< Integer> different = new HashSet<>(hashSet1);
        different.removeAll(hashSet2);

        System.out.println(different);
    }
}
