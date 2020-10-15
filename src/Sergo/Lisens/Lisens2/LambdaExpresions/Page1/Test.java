package Sergo.Lisens.Lisens2.LambdaExpresions.Page1;
interface Executable{
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e){
        int a = e.execute(10, 12);
        System.out.println(a);
    }
}

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x + y;}
        });
        int a = 1; // если используешт переменую в лямбде то менять ее нельзя она должна быть файнал
        runner.run((x,y) -> x + y); // в этом лямбда выражение зона видимости там где ее создал те в нижней скабке
    }
}
