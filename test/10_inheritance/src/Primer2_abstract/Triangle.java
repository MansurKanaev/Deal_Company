package Primer2_abstract;

// класс, реализующий треугольник
class Triangle extends Figure {
    double a, b, c; // стороны треугольника

    // конструктор
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // переопределение абстрактного метода ShowName()
    @Override
    void ShowName() {
        name = "Triangle";
        System.out.println(name);
    }

    // переопределение абстрактного метода Area()
    // площадь треугольника
    @Override
    double Area() {
        // проверка, вообще ли из расстояний a, b, c можно образовать треугольник
        if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
            return 0.0;
        } else {
            double p = (a + b + c) / 2; // полу периметр
            double s;

            // Формула Герона
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
        }
    }
}
