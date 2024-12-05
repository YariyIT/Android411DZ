public class DZ015 {
    public static void main(String[] args) {

        String s = "Hello, World";  //  Дана строка, нужно посчитать кол-во строчных и прописных букв
        System.out.println(s);  //
        int resultP = 0;  //  Создаём переменную прописных букв
        int results = 0;  //  Создаём переменную строчяных букв
        for (int i = 0; i < s.length(); i++) {  //  Запускаем цикл проверки прописных букв
            char ch = s.charAt(i);  //  Создаём переменную "ch" и присваеваем ей значение символа из массива по индексу "i"
            if(ch >='A' && ch <= 'Z'){  //  Проверяем, попадает ли символ из данной строки в диапозон прописных букв
                resultP++;  //  При выполнении условия, увеличиваем переменную прописных букв на -1-
            }
            if(ch >='a' && ch <= 'z'){  //  Проверяем, попадает ли символ из данной строки в диапозон строчных букв
                results++;  //  При выполнении условия, увеличиваем переменную строчных букв на -1-
            }

        }
        System.out.println("Количество строчных букв - " + results + ", количество прописных букв - " + resultP);
    }
}