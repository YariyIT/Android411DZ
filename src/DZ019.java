import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ019 {
    public static void main(String[] args) {

        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78, 923-436+56+66+2345, =7456+46-745";
        String[] arr = s.split(",\\s*");
        String pattern = "\\+* *7 *\\(*[0-9]{3}\\)*\\s*[0-9]{3}(\\s*\\-*[0-9]{2}){2}";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);


        while (matcher.find()) {
                System.out.println(matcher.group());
            }

    }
}
