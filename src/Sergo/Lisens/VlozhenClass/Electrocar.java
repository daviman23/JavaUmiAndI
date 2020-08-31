package Sergo.Lisens.VlozhenClass;

import java.sql.SQLOutput;

public class Electrocar {
    private int id;
    //ВЛОЖЕННЫЙ НЕСТОТИЧЕСКИЙ КЛАСС
    private class Motor{
        public  void StartMotor(){
            System.out.println("Motor is Startong");
        }
    }
    //СТАТИЧЕСКИЙ ВЛОЖЕННЫЙ КЛАСС
    public static class Battery{
        public  void charge(){
            System.out.println("Battery is charging...");
        }
    }
    public Electrocar(int id){
        this.id = id;
    }
    public void start(){

        final int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("electrocar " + this.id + " is starting...");
    }
}
