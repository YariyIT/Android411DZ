package DZ023;

public class Main {
    public static void main(String[] args) {
        Box3D box3D = new Box3D(5, 3, 2);
        System.out.println(box3D);
        box3D.setWidth(10);
        box3D.setHeight(5);
        box3D.setDepth(7);
        System.out.println("\nНовые значения");
        System.out.println(box3D);
    }
}
