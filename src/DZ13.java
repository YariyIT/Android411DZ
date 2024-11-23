import java.util.Scanner;

public class DZ13 {


    public static void main(String[] args) {

        int[] mas = {-2, 3, 8, -11, -4, 6};

        otr(0, 0, mas);

    }

    static int otr(int n, int i, int[] mas) {

        if (i > (mas.length - 1)) {
            System.out.println(n);
            return n;

        } else {
            if (mas[i] < 0) {
                n++;
            }
            i++;
            return otr(n, i, mas);


        }
    }


}