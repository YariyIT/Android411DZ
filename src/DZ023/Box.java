package DZ023;

public class Box { // создали класс -Box-
    private double width; // создали переменную ширины -width- и закрыли от непосредственных изменений
    private double height; // аналогично

    public Box(){

    }

    public Box(double width, double height) { // создали конструктор
        setWidth(width);
        setHeight(height);
    }

    // Создали геттеры и сеттеры, для получения возможности изменять значения
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){ // Проверка корректности значения
            throw new IllegalArgumentException("Требуется положительное значение");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){ // Проверка корректности значения
            throw new IllegalArgumentException("Требуется положительное значение");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Объект Box3D{" +
                "ширина: " + width +
                ", высота: " + height +
                '}';
    }
}
