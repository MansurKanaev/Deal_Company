package Primer2_abstract;

// абстрактный класс, который описывает некоторую геометрическую фигуру
abstract class Figure {
    protected String name = ""; // имя фигуры
    protected double pi = 3.1415; // константа Пи

    // абстрактные методы, которые будут переопределяться в производных классах

    abstract void ShowName(); // вывести имя фигуры

    abstract double Area(); // определение площади


}

