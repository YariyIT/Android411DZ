package DZ023;

public class Box3D extends Box {
    private double depth; // Создали переменную глубины


    public Box3D(double width, double height, double depth) {
        super(width, height);
        setDepth(depth);

    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if(depth <= 0){ // Проверка корректности значения
            throw new IllegalArgumentException("Требуется положительное значение");
        }
        this.depth = depth;
    }

    @Override
    public String toString() {
        return super.toString() + "Box3D{" +
                "глубина=" + depth +
                '}' + "\nОбъём: " + (getWidth() * getHeight() * getDepth());
    }
}
