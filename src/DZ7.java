import java.util.Scanner;

public class DZ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int osn, empty, full;

        System.out.print("Введите размер основания\n(нечётное число в диапозоне от 3 до 25): ");
        osn = input.nextInt();

        if (osn >= 3 && osn <= 25 && osn % 2 == 1){
            for (int i = 0; i < osn; i = i + 2) {
                empty = (osn - i - 1) / 2;
                for (int j = 0; j < empty; j++) {
                    System.out.print(" ");
                }
                full = i + 1;
                for (int j = 0; j < full; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < empty; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }else {
            System.out.println("Введён неверный параметр");
        }

    }
}
