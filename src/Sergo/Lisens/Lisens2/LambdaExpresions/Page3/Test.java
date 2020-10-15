package Sergo.Lisens.Lisens2.LambdaExpresions.Page3;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        filllist(list);

       /* for (int i = 0; i < 10 ; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i)* 2);
        }*/
        //map method
        arr = Arrays.stream(arr).map(a -> a*2).toArray();
        list = list.stream().map(a -> a*2).collect(Collectors.toList());

        arr = Arrays.stream(arr).map(a -> 3).toArray();
        arr = Arrays.stream(arr).map(b -> b + 1).toArray();

        System.out.println("map " + Arrays.toString(arr));
        System.out.println("map " + list);
        // filter method
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(arr1);
        filllist(list1);

        arr1 = Arrays.stream(arr1).filter(a -> a % 2 == 0).toArray();
        list1 = list1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println("filter " + Arrays.toString(arr1));
        System.out.println("filter " + list1);

        // forEach проход по элементам
        Arrays.stream(arr1).forEach(System.out::println);
        list1.stream().forEach(a -> System.out.println(a));

        //reduce
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        filllist(list2);
        fillArr(arr2);

        int sum = Arrays.stream(arr2).reduce((acc, b) -> acc + b).getAsInt();
        int sum1 = list2.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum);
        System.out.println(sum1);

        int[] arr3 = new int[10];
        fillArr(arr3);

       int[] myArray = Arrays.stream(arr3).filter(a -> a % 2 != 0).map(a -> a *2).toArray();
        System.out.println(Arrays.toString(myArray));

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);

        set = set.stream().map(a -> a * 2).collect(Collectors.toSet());
        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        set1 = set1.stream().map(a -> 2).collect(Collectors.toSet());
        System.out.println(set1);  // проверкак сетов на космтыль
    }
    public static void fillArr(int[] x){
        for (int i = 0; i < 10; i++) {
            x[i] = i + 1;
        }
    }
    public static void filllist(List<Integer> list){
        for (int i = 0; i < 10 ; i++) {
            list.add(i + 1);
        }
    }
}
