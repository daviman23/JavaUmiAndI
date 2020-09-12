package Sergo.Lisens.AllVideo;

public class ClasesAndObject {
    public static void main(String[] args) {
    Person person1 = new Person();
   person1.setName("");
   person1.setAge(0);
   person1.speak();
        System.out.println("Верни имя " + person1.getName());
        System.out.println("Верни возраст " + person1.getAge());
    }
}
class Person{
   private String name;
    private int  age;

    public void setName( String username){
        if(username.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        }
        else{
            name = username;}
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if(userAge > 0){
            age = userAge;
        }else{
            System.out.println("ты ввел не правильный возраст");
        }
        age = userAge;
    }

    public int getAge(){
        return age;
    }

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