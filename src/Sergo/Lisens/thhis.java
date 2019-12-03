package Sergo.Lisens;

public class thhis {
    public static void main(String[] args) {
       Human human1 = new Human();
       human1.setAge(18);
       human1.setName("Ivan");
       human1.getInfo();
    }
}

class Human{
    String name;
    int age;

    public void setName(String Name){
        this.name = Name;
    }

    public void setAge(int Age){
        this.age = Age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + age);
    }
}
