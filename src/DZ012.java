import java.util.Scanner;

public class DZ012 {
    public static void main(String[] args) {
        System.out.print("Введите длинну стороны квадрата: ");
        int s = side();

        if (s == 1) {
            System.out.println("=");
        } else {
            upDown(s);
            for (int i = 0; i < (s - 2); i++) {
                leftToRight(s);
            }
            upDown(s);
        }

    }

    public static int side() {
        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            return input.nextInt();
        } else {
            System.out.print("Введено не верное значение. Повторите ввод: ");
            return side();
        }
    }

    public static void upDown(int d) {
        for (int i = 0; i < d; i++) {
            System.out.print("==");
        }
        System.out.println();
    }

    public static void leftToRight(int d) {

        if (d > 2) {
            System.out.print("=");
            for (int i = 0; i < (d - 1); i++) {
                System.out.print("\\/");
            }
            System.out.println("=");

        }

    }
}
