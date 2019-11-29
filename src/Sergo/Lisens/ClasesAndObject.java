package Sergo.Lisens;

public class ClasesAndObject {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setNameAndAge("иывн",10);
    person1.speak();
    Person person2 = new Person();
    person2.age = 20;
    person2.name = "Серго";
    person2.sayHello();
    int year1 = person1.colculete();
        System.out.println(year1);
    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String username, int ageuser){
        name = username;
        age = ageuser;
    }
    int colculete(){
        int years = 65 - age;
        return(years);
    }
    void speak(){
        System.out.println("Меня зовут " + name + " и мне " + age);
    }

    void sayHello(){
        System.out.println("Привет");
    }
}