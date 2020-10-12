package Sergo.Lisens.Lisens2.FrameWork.compareter;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        animals.add("Bird");
        animals.add("a");

        Collections.sort(animals,new stringLenghtCompfrator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);


        Collections.sort(numbers, (integer, t1) -> { // лямда
            if(integer < t1){
                return 1;
            }else if(integer > t1){
                return -1;
            }else{
                return 0;
            }
        });
        System.out.println(numbers);

        List<Person> People = new ArrayList<>();

        People.add(new Person(3,"Mike"));
        People.add(new Person(1,"Bob"));
        People.add(new Person( 2, "Kety"));


        Collections.sort(People, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                if(person.getId() > t1.getId()){
                    return 1;}
                else if (person.getId() < t1.getId()){
                    return -1;
                }
                else{
                    return 0;
            }}
        });
        System.out.println(People);
    }
}

class stringLenghtCompfrator implements Comparator<String>{

    @Override
    public int compare(String s, String t1) {
        /*
        O1 > o2 = 1;
        O1< o2 = -1;
        o1 == o2 = 0;
         */
        if (s.length() > t1.length()){
            return 1;}
        else if (s.length() < t1.length()){
            return -1;}
        else{
            return 0;}
    }
}
class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}