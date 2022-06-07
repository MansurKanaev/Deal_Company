package Primer1_inheritance;

public class Square extends Rectangle {

    public Square(int width, int height) {
        super(width, height);
        if (width != height) {
            System.out.println("Ширина не равна высоте!");
        }
    }


    public Square(int width) {
        super(width, width);
    }

    public void setWidth(int width) {
        this.width = width;
        height = width;
    }

    public void setHeight(int height) {
        this.height = height;
        width = height;
    }
}
