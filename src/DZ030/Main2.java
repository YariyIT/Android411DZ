package DZ030;

// Ч Е Р Е З   А Н А Н И М Н Ы Й   К Л А С С

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String word1 = enterStr("первое"); // создаём переменную -word1- и запускаем ввод первого слова
        String word2 = enterStr("второе"); // -"- второго слова

        WordCheck2 word = new WordCheck2() {
            @Override
            public String word(String a, String b) {
                if (a.length() == b.length()) {
                    return "Слова равны.";
                } else if (a.length() < b.length()) {
                    return "Самое короткое слово: " + a;
                }
                return "Самое короткое слово: " + b;
            }
        };

        System.out.println(word.word(word1, word2));

    }

    static public String enterStr (String s){ // Метод ввода строки
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

class WordCheck2{
    public String word(String a, String b){
        if(a.length() == b.length()){
            return "Слова равны.";
        } else if(a.length() > b.length()){
            return "Самое длинное слово: " + a;
        }
        return "Самое длинное слово: " + b;
    }

}