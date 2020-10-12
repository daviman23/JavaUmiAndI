package Sergo.Lisens.Lisens2.Regexp.Page3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "joe@yandex.ru  and me adres and my text you need me????? WTF Bob@gmail.com";

        Pattern email = Pattern.compile("(\\w+)@((gmail|yandex)\\.(com|ru))");
        Matcher matcher = email.matcher(text);
        while (matcher.find()){  //поиск соответствий
            System.out.println(matcher.group(2));  //груп выводить то что нашел фаинд
        }
    }
}
