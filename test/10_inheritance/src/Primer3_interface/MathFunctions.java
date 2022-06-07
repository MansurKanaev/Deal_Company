package Primer3_interface;

// класс, который реализует интерфейс IMathFunctions
public class MathFunctions implements IMathFunctions {

    // Реализация методов интерфейса IMathFunctions
    // 1. Модуль комплексного числа
    public double AbsComplex(double real, double imag) {
        double abs;
        abs = Math.sqrt(real * real + imag * imag);
        return abs;
    }

    // 2. Возведение в степень целочисленных значений
    public int Power(int x, int y) {
        int p, i;
        p = 1;
        for (i = 1; i <= y; i++)
            p = p * x;
        return p;
    }
    // Внутренние методы класса, не относится к интерфейсу.
    // Определение длины окружности
    public double Circumference(double radius) {
        return 2 * pi* radius; // используется переменная pi из интерфейса
    }
}
