package DZ028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите количество элементов числового массива: ");
        Scanner input = new Scanner(System.in);
        int l1 = input.nextInt();
        Integer[] num = new Integer[l1];

        for (int i = 0; i < num.length; i++) {
            System.out.print("-> ");
            num[i] = input.nextInt();
        }

        System.out.print("Введите количество элементов массива строк: ");
        int l2 = input.nextInt();
        String[] str = new String[l2];

        for (int i = 0; i < str.length; i++) {
            System.out.print("-> ");
            str[i] = input.next();
        }
        System.out.println();

        printArray(num);
        printArray(str);

    }

    public static <T> void printArray(T[] arr) {
        System.out.print("Массив: ");
        for (T el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
