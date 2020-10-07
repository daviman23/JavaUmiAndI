package Sergo.Lisens.Lisens2.LinkedHashMapANDTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
       Map<Integer, String> hashMap = new HashMap<>();
       // внктри нет порядка и гарантии
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //будет порядок пар
        Map<Integer, String> treemap = new TreeMap<>();
        // будут сортировка по ключу
        TestMap(hashMap);
        System.out.println();
        TestMap(linkedHashMap);
        System.out.println( );
        TestMap(treemap);
    }
    public static void TestMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78,"Tom");
        map.put(0,"Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
