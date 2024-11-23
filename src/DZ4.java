import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args){
        int coin, word;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 99: ");
        coin = input.nextInt();
        if (coin < 1 || coin > 99){
            System.out.println("Вы ввели не корректное число");
        } else if (coin >= 11 && coin <= 20){
            System.out.println(coin + " копеек");
        } else {
            word = coin % 10;
            if (word == 1){
                System.out.println(coin + " копейка");
            }
            if (word >= 2 && word <= 4){
                System.out.println(coin + " копеейки");
            }
            if (word >= 5 && word <= 9 || word == 0){
                System.out.println(coin + " копеек");
            }
            input.close();

        }

    }
}
