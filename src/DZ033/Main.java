package DZ033;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(); // Создаём сет -num-
        Scanner in = new Scanner(System.in); // Подключаем ввод даннах с клавиатуры

        System.out.println("Заполните сет пятью целочисленными значениями: ");
        for (int i = 0; i < 5; i++) { // Создаём цикл ввода данных пользователем
            System.out.print((i + 1) + " значение: "); // Просим ввести очередное значение
            num.add(in.nextInt()); // Записываем введённое значение в сет -num-
        }
        System.out.println("Наименьший элемент в TreeSet: " + num.first()); // Выводим первое значение сета -num- оно же, по спецмфике хранения данных, и наименьшее из хранимых значение
    }
}
