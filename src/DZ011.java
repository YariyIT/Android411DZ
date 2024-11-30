import java.util.Scanner;

public class DZ011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите, площадь какой фигуры вы хотите найти,\n 1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        int f = input.nextInt();

        if (f >= 1 && f <= 3) {
            if (f == 1) {
                System.out.print("Введите сторону a = ");
                int a = input.nextInt();
                System.out.print("Введите сторону b = ");
                int b = input.nextInt();
                sP(a, b);
            } else if (f == 2) {
                System.out.print("Введите сторону a = ");
                double a = input.nextDouble();
                System.out.print("Введите сторону b = ");
                double b = input.nextDouble();
                System.out.print("Введите сторону c = ");
                double c = input.nextDouble();
                sT(a, b, c);
            } else if (f == 3) {
                System.out.print("Введите радиус = ");
                double r = input.nextDouble();
                sC(r);
            }
        } else {
            System.out.println("Ошибка ввода");


        }

    }
    public static void sP ( int a, int b){
        int s = 0;
        s = a * b;
        System.out.println("Площадь: " + s);

    }
    public static void sT(double a, double b ,double c){
        double p = (a + b + c) / 2;
        System.out.println("Площадь: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
    public static void sC(double r){
        System.out.println("Площадь: " + Math.PI * (Math.pow(r, 2)));
    }
}
