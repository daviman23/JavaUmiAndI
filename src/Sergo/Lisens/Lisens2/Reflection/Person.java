package Sergo.Lisens.Lisens2.Reflection;


@Author(name = "Nelly", dateOfCreate = 2020)
public class Person {
    private int id;
    private String name;

    public Person(){
        this.id = -1;
        this.name = "No name";
    }

    public Person(int id, String name){
        this.name = name;
        this.id = id;
    }

    public void sayHello(){
        System.out.println("Person with id" + id + " and name" + name + " Say hello");
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
