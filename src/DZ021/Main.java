package DZ021;

public class Main {
    public static void main(String[] args) {
        System.out.println("Плошадь треугольника по формуле Герона: " + Area.triangleArea1(3, 4, 5));
        System.out.println("Плошадь треугольника по высоте и основанию: " + Area.triangleArea2(3, 4));
        System.out.println("Плошадь квадрата: " + Area.kvArea(3));
        System.out.println("Плошадь прямоугольника: " + Area.pArea(3, 4));



    }
}

