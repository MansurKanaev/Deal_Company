package Primer2_abstract;

class Rectangle extends Figure {

    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    // переопределение абстрактного метода ShowName()
    @Override
    void ShowName() {
        name = "Rectangle";
        System.out.println(name);
    }

    // переопределение абстрактного метода Area()
    @Override
    double Area() {
        return a * b;
    }
}
