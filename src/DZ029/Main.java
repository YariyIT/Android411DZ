package DZ029;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws NewException {
        String str = enterStr(); // Объявляем переменную -str-, и обращаемся к методу ввода строки
        try {
            checkStr(str);
        }catch (NewException e){
            System.out.println("Ошибка:" + e);
        }



    }

    static public String enterStr() { // Метод ввода строки
        Scanner input = new Scanner(System.in); // Подключаем возможность ввода
        System.out.print("Введите строку: ");
        String str = input.nextLine(); // Объявляем строковую переменную, и присваеваем ей значение введённое пользователем
        if (str.isEmpty()) { // Проверяем, не ввёл ли пользователь пустую строку
            System.out.println("Вы ввели пустую строку. Повторите ввод.");
            return enterStr();
        } else {

            return str; // Возвращаем введённую строку в виде переменной
        }
    }

    public static void checkStr(String s) throws NewException {
        String pattern = "[AaEeIiOoUuYyАаУуЩщИиЭэЫыЯяЮюЕеЁё]";
        Pattern reg = Pattern.compile(pattern);
        Matcher matcher = reg.matcher(s);
        System.out.println("\n\nИсходная строка: " + s);

        if (matcher.find()) System.out.println("Срока содержит гласные буквы");
        else throw new NewException("Строка не содержит гласные буквы");
    }
}

class NewException extends Exception{
    public NewException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return " " + getMessage();
    }
}

