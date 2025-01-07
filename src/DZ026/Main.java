package DZ026;

interface Resize {
    void resizeWidth(int w);
    void resizeHeight(int h);

}
public class Main {
    public static void main(String[] args) {

        Rectangle size = new Rectangle(100, 150);
        size.resizeWidth(250);
        size.resizeHeight(300);
    }
}

class Rectangle implements Resize{


    public Rectangle(int width, int height) {
        System.out.println("Width: " + width + ", Height: " + height);

    }


    @Override
    public void resizeWidth(int w) {
        System.out.print("Width: " + w);
    }

    @Override
    public void resizeHeight(int h) {
        System.out.println(", Height: " + h);
    }
}
