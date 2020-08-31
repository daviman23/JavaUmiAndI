package Sergo.Lisens.Enum;

public enum Animal {
    DOG("Собака"), FROG("Лягушка"), CAT("Кошка");

    private String transletion;

    Animal(String transletion){
        this.transletion = transletion;
    }

    public String getTransletion(){
        return transletion;
    }
    public String toString(){
        return "перевод на русский язык" + transletion;
    }
}
