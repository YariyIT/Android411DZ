import java.util.Scanner;

public class DZ10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Выбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n: ");
        int f = input.nextInt();

        if (f >= 1 && f<=3){
            if(f == 1){
                System.out.print("Введите сторону a = ");
                double a = input.nextDouble();
                System.out.print("Введите сторону b = ");
                double b = input.nextDouble();
                System.out.print("Введите сторону c = ");
                double c = input.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            }
            if (f == 2){
                System.out.print("Введите сторону a = ");
                double a = input.nextDouble();
                System.out.print("Введите сторону b = ");
                double b = input.nextDouble();
                System.out.println(a * b);
            }
            if (f == 3){
                System.out.print("Введите радиус = ");
                double r = input.nextDouble();
                System.out.println(Math.PI * (Math.pow(r, 2)));
            }
        }else {
            System.out.println("Вы ввели не верное значение");
        }


    }
}
