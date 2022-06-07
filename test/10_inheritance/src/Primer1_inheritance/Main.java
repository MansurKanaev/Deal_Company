package Primer1_inheritance;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(20,10);
        System.out.println(rectangle.toSting());
        System.out.println(square.toSting());
    }
}
