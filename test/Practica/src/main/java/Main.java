public class Main {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        randomNumber number = new randomNumber();
        Arithmetic arithmetic = new Arithmetic(5, 10);
        SwimmingPool swim = new SwimmingPool();
//        factorial.calculate();
//        factorial.forCycle();
//        arithmetic.print();
//        swim.fillingPool();
//        number.randomNum();
        Printer printer = new Printer();
        printer.append("Реферат", "Мой первый код.", 10);
        printer.print();
        printer.append("Дело", "Задача");
        printer.print();
        printer.clear();
        printer.append("Чек");
        printer.print();
    }
}

