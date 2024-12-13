package DZ020.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("X7 M50i", "2021", "BMW", "530 л.с.", "wite", "10790000");
        System.out.println("*********** Данные автомобиля ***********");
        System.out.println("Название модели: " + car1.getMod());
        System.out.println("Год выпуска: " + car1.getYear());
        System.out.println("Производитель: " + car1.getMade());
        System.out.println("Мощность двигателя: " + car1.getPower());
        System.out.println("Цвет машины: " + car1.getColour());
        System.out.println("Цена: " + car1.getPrice());
        System.out.println("=========================================");

    }
}
