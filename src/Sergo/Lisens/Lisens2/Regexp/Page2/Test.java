package Sergo.Lisens.Lisens2.Regexp.Page2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Hello1343121there12341431hey";
        String[] str = a.split("\\d+");
        System.out.println(Arrays.toString(str));

        String b = "Hello there hey";
        String c = b.replace(" ", ".");
        System.out.println(c);

        String r = "Hello1233Hello23444Hello";
        String r1 = r.replaceFirst("\\d+", "-");
        System.out.println(r1);
    }
}
