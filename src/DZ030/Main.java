package DZ030;

// Ч Е Р Е З   Л Я М Б Д А

import java.util.Scanner;

interface WordCheck {
    String word(String a, String b);
}

public class Main {
    public static void main(String[] args) {
        String word1 = enterStr("первое"); // создаём переменную -word1- и запускаем ввод первого слова
        String word2 = enterStr("второе"); // -"- второго слова

        WordCheck wordShort = (w1, w2) -> { // Создаём лямбда выражение для сравнения строк
            if(w1.length() == w2.length()){
                return "Слова равны.";
            } else if(w1.length() < w2.length()){
                return "Самое короткое слово: " + w1;
            }
            return "Самое короткое слово: " + w2;
        };
        String w = wordShort.word(word1, word2); // Создаём переменную и присваеваем ей значение полученное в результате проверки лямбда-выражением
        System.out.println(w);
    }

    static public String enterStr(String s) { // Метод ввода строки
        Scanner input = new Scanner(System.in); // Подключаем возможность ввода
        System.out.print("Введите " + s + " слово: ");
        String str = input.nextLine(); // Объявляем строковую переменную, и присваеваем ей значение введённое пользователем
        if (str.isEmpty()) { // Проверяем, не ввёл ли пользователь пустую строку
            System.out.println("Вы ввели пустую строку. Повторите ввод.");
            return enterStr(s);
        } else if (str.trim().split("\\s+").length > 1) { // Обрезаем пробелы по концам строки -trim-, далее разбиваем строку по словам -split- создавая массив и выводим  его велечину -lengrh- и сравниваем с единицей: проверка на ввод нескольких слоав
            System.out.println("Вы ввели не одно слово. Повторите ввод.");
            return enterStr(s);
        }

        return str; // Возвращаем введённую строку в виде переменной
    }

}
