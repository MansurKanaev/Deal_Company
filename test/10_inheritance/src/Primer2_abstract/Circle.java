package Primer2_abstract;

// класс, реализующий окружность, наследует класс Figure
class Circle extends Figure {
    double r;

    // конструктор
    Circle(double r) {
        this.r = r;
    }

    // переопределение абстрактного метода Area()
    @Override
    double Area() {
        return pi * r * r;
    }

    // переопределение абстрактного метода ShowName()
    @Override
    void ShowName() {
        name = "Circle";
        System.out.println(name);
    }
}
