package Primer2_abstract;

public class UseAbstractClass {

    // метод, который возвращает площадь фигуры, f - ссылка на базовый класс
    // используется позднее связывание,
    // метод для вычисления площади определяется на основе значения ссылки f
    static double GetArea(Figure f) {
        return f.Area(); // вызов метода вычисления площади
    }

    public static void main(String[] args) {
        // демонстрация использования абстрактных методов Area() и ShowName()
        Figure f1 = new Triangle(3.5, 1.8, 2.2); // экземпляр класса Triangle
        Figure f2 = new Circle(3.0); // экземпляр класса Circle
        Figure f3 = new Rectangle(4, 5);

        double area;

        // вычисление площади для треугольника
        // реализация позднего связывания
        area = GetArea(f1);
        System.out.println("S Triangle = " + area);
        f1.ShowName(); // Triangle

        // вычисление площади для окружности,
        // реализация позднего связывания
        area = GetArea(f2); // area = 28.2735
        System.out.println("S Circle = " + area);
        f2.ShowName(); // Circle

        area = GetArea(f3);
        System.out.println("S Rectangle = " + area);
        f3.ShowName();
    }
}