package Sergo.Lisens.Lisens2.Regexp.Page1;

public class Test {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна буква
            + - 1 или более
            * - 0 или более
            ? - символ до него может быть а может не быть
            \\ - использование специ символа как обычный сивол
            ( | | ) - Диапозон событий разных знаков
            [a-zA-Z] - все английские буквы
            [^abc] - хотим вске кроме этого
            . - любой символ

            {2} - 2 симыола до
            {2, } - 2 или более символов
            {2, 4} - от 2 до 4 символов
         */

        String a = "-12358438984";
        String b = "134642342";
        String c = "+45643532";

        System.out.println(b.matches("(-|\\+)?\\d+"));
        System.out.println(a.matches("(-|\\+)?\\d+"));
        System.out.println(c.matches("(-|\\+)?\\d+")); // сравнение что написанно в строке

        String d = "q31fega123466543";
        System.out.println(d.matches("[a-zA-Z31]+\\d*"));

        String e = "Hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url1 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{2} "));
    }
}
