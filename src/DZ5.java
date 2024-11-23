import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        int hour;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        hour = input.nextInt();
        String timeOfDay = switch (hour) {
            case 0, 1, 2, 3, 4, 5 -> "Доброй ночи!";
            case 6, 7, 8, 9, 10, 11, 12 -> "Доброе утро!";
            case 13, 14, 15, 16 -> "Добрый день!";
            case 17, 18, 19, 20, 21, 22, 23 -> "Добрый вечер!";
            default -> "Такого часа не существует";

        };
        System.out.println(timeOfDay);
    }
}
