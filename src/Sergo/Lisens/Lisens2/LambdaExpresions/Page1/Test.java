package Sergo.Lisens.Lisens2.LambdaExpresions.Page1;
interface Executable{
    void execute();
}

class Runner {
    public void run(Executable e){
        e.execute();
    }
}

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });
        runner.run(() ->System.out.println("Hello"));
    }
}
