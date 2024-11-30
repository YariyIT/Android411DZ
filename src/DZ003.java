import java.util.Scanner;

public class DZ003 {
    public static void main(String[] args){
        System.out.println("Пользователь вводит с клавиатуры пятизначное число.");
        System.out.println("Требуется найти произведение цыфр введённого числа и его среднее арефметическое.");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        int num = input.nextInt();
        input.close();

        int n1 = num % 10;
        int n2 = num / 10 % 10;
        int n3 = num / 10 / 10 % 10;
        int n4 = num / 10 / 10 / 10 % 10;
        int n5 = num / 10 / 10 / 10 / 10 % 10;
//        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        int mult = n1 * n2 * n3 * n4 *n5;
        double arithmeticMean = (n1 + n2 + n3 + n4 +n5) / 5.;
        System.out.println("Произведение цыфр числа " + num + ": " + mult);
        System.out.println("Среднее арифметическое числа " + num + ": " + arithmeticMean);

    }
}
