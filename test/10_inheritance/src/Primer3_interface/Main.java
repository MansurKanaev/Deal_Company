package Primer3_interface;

public class Main {
    public static void main(String[] args) {
        // использование интерфейса
        IMathFunctions mf = new MathFunctions(); // объявить экземпляр класса MathFunctions
        //IMathFunctions mf2 = new IMathFunctions(); ошибка - запрещено объявлять экземпляр интерфейса
        MathFunctions f = new MathFunctions();



        int d;
        double x, y;
        double pi;

        // вызов интерфейсных методов через экземпляр mf
        d = mf.Power(3, 4); // d = 81
        x = mf.AbsComplex(2, 3); // x = 3.605551275463989
        y = f.Circumference(3);
        pi = mf.pi; // pi = 3.1415926535

        System.out.println(d + "\n" + x + "\n"  + y + "\n" + pi);
    }
}
