package Sergo.Lisens.AllVideo;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        int [] numbers1 = {1,2,3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }

}
