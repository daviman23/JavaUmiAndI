package Sergo.Lisens.Lisens2.FrameWork.InterfaceComparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peoplelist = new ArrayList<>();
        Set<Person> personset = new TreeSet<>();

        addElements(personset);
        addElements(peoplelist);

        Collections.sort(peoplelist);

        System.out.println(peoplelist);
        System.out.println(personset);
     }
    private static void addElements(Collection collection){
        collection.add(new Person(3,"Katy"));
        collection.add(new Person(4,"George"));
        collection.add(new Person(1,"Bob"));
        collection.add(new Person(2, "To"));
    }
}
class Person implements Comparable<Person> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person person) {
        if(this.name.length() > person.getName().length()){
            return 1;
        }else if(this.name.length() < person.getName().length()){
            return -1;
        }else{
            return 0;
        }
    }
}