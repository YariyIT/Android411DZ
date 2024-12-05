import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ018 {
    public static void main(String[] args) {

        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login3@i.ru, login.3-67@i.ru, 1login@ru.name.ru, rh@фыв.ru"; // последнее проверочное не выводится

        String pattern = "[\\d\\wА-яЁё.-]+[@][\\w.]+"; // Создаём шаблон
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
                System.out.println(matcher.group());
            }
    }
}
