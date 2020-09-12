package Sergo.book.DogBark;

public class Dog {
    private int size;

    public Dog(int size) {
        if (size <= 0) {
            this.size = size;
            System.out.println("Это не собака");
        } else if (size <= 15) {
            this.size = size;
            System.out.println("Тяф Тяф!");
        } else if (size > 15 && size < 60) {
            this.size = size;
            System.out.println("Гав Няф");
        }
        else{
            this.size = size;
            System.out.println("ГАФ ГАФ");
        }
    }
}