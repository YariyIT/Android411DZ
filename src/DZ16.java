import java.util.Scanner;

public class DZ16 {

    public static void main(String[] args) {

        String str = enterStr(); // Объявляем переменную -str-, и обращаемся к методу ввода строки
        str = str.replace(" ", ""); // Убираем пробелы из строки
        String strRev = sR(str); // Объявляем переменную -strRev-, и обращаемся к методу разворота строки

        if(str.equalsIgnoreCase(strRev)){ // Проверяем является ли строка палиндромом, и выводим результат
            System.out.println("Строка является палиндромом");
        }else {
            System.out.println("Строка не является палиндромом");
        }

    }

    static public String enterStr(){ // Метод ввода строки
        Scanner input = new Scanner(System.in); // Подключаем возможность ввода
        System.out.print("Введите строку: ");
        String str = input.nextLine(); // Объявляем строковую переменную, и присваеваем ей значение введённое пользователем
        if (str.isEmpty()) { // Проверяем, не ввёл ли пользователь пустую строку
            System.out.println("Вы ввели пустую строку. Повторите ввод.");
            return enterStr();
        } else {

            return str;
        }
    }

    static public String sR(String s){ // Метод разворота строки
        String strRev = "";
        for (int i = 0; i < s.length(); i++) {
           strRev += s.charAt((s.length() - 1) - i);
        }
        return (strRev);
    }



}
