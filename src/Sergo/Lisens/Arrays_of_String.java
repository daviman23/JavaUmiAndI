package Sergo.Lisens;

public class Arrays_of_String {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Hello ";
        strings[1] = "i am ";
        strings[2] = "lose";
        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string: strings){
            System.out.println(string);
        }
        int[] n = {1,2,3};
        int sum = 0;
        for(int x: n){
            sum = sum + x;
            System.out.println(sum);
        }
    }
}
