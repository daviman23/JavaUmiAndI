package Sergo.Lisens.VlozhenClass;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery Battery = new Electrocar.Battery();
        Battery.charge();

    }
}
