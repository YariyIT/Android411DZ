package DZ025;

public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Shar("Шар");
        shape[1] = new Cilindr("Цилиндр");
        shape[2] = new Piramida("Пирамида");

        for(Shape shape1 : shape){
            shape1.sh();
            shape1.VShape();
        }
    }
}

abstract class Shape{
    private String nameShape;

    public Shape(String nameShape) {
        this.nameShape = nameShape;
    }

    public String getNameShape() {
        return nameShape;
    }

    public void sh(){
        System.out.print("Фигура: ");
    }

    public abstract void VShape();
}

class Shar extends Shape{
    public Shar(String nameShape) {
        super(nameShape);
    }

    @Override
    public void VShape() {
        double vs = (4 / 3)*(Math.PI)*(Math.pow(15, 3));
        System.out.print("шар      | Объём фигуры: " + vs + "\n");
    }
}

class Cilindr extends Shape{
    public Cilindr(String nameShape) {
        super(nameShape);
    }

    @Override
    public void VShape() {
        double vc = (Math.PI)*(Math.pow(12, 2))*17;
        System.out.print("цилиндр  | Объём фигуры: " + vc + "\n");
    }
}

class Piramida extends Shape{
    public Piramida(String nameShape) {
        super(nameShape);
    }

    @Override
    public void VShape() {
        double vp = ((5*5) / 3)* 3;
        System.out.print("пирамида | Объём фигуры: " + vp + "\n");
    }
}