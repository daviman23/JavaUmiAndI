package Sergo.Lisens.Lisens2.Annotetion.Page2;

public class TestTest extends Test {
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.Stringrer();

        }
    @Override // позволяет выевить ощибку при переопределение метода
    public void eror(){
        System.out.println("EROR");
    }
}


