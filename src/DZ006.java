import java.util.Scanner;

public class DZ006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int n, line;
//        String sim;
//        System.out.print("Введите количество символов: ");
//        n = input.nextInt();
//        System.out.print("Тип символа: ");
//        sim = input.next();
//        System.out.println("0 - горизонтальная");
//        System.out.println("1 - Вертикальная");
//        System.out.print("ориентация линии: ");
//        line = input.nextInt();
//        if (line >= 0 && line <=1){
//            for (int i = 0; i < n; i++) {
//                if (line == 0) {
//                    System.out.print(sim);
//                }else {
//                    System.out.println(sim);
//                }
//        }
//        } else {
//            System.out.println("Вы ввели неправильное значение ориентации линии");
//        }
//        input.close();

/* вариант через char */
        int n, line;
        char sim;
        System.out.print("Введите количество символов: ");
        n = input.nextInt();
        System.out.print("Тип символа(если вы введёте несколько символов, то выведется только первый символ: ");
        sim = input.next().charAt(0);
        System.out.println("0 - горизонтальная");
        System.out.println("1 - Вертикальная");
        System.out.print("ориентация линии: ");
        line = input.nextInt();
        if (line >= 0 && line <=1){
            for (int i = 0; i < n; i++) {
                if (line == 0) {
                    System.out.print(sim);
                }else {
                    System.out.println(sim);
                }
            }
        } else {
            System.out.println("Вы ввели неправильное значение ориентации линии");
        }
        input.close();


    }
}