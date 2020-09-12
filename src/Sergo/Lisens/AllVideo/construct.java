package Sergo.Lisens.AllVideo;

public class construct {
    public static void main(String[] args) {
    Human2 human1 = new Human2("Tom");
    }

}

class Human2{
    int age;
    String name;
    public Human2(){
        System.out.println("поривет из первого конструктора!");
    }

    public Human2(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public Human2(String name, int age){
        this.name = name;
        this.age = age;
    }
}
