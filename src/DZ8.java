import java.util.Scanner;

public class DZ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int start = input.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end = input.nextInt();
        int[] array = new int[end - start + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + start;
            System.out.print(array[i] + "  ");

        }
    }
}
