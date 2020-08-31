package Sergo.Lisens.Equals;

public class Animal {
    public static void main(String[] args) {
        Dog Dog1 = new Dog(1);
        Dog Dog2 = new Dog(1);

        System.out.println(Dog1.equals(Dog2));

        Object Object = new Object();

        String a = "Hello!";
        String b = "Hello";

        System.out.println(b.equals(a));

    }
}
class Dog{
    private int id;

    public Dog(int id){
        this.id = id;
    }

    public boolean equals(Object obj) {
        Dog otherDog = (Dog) obj;

        return this.id == otherDog.id;
    }
}
