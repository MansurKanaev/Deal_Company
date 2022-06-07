import java.util.Scanner;

public class Factorial {

    public void calculate() {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
        int result = 1;

        System.out.print(value + "!" + " = ");
        for (int i = 1; i <= value; i++) {
            if (i < value) {
                result *= i;
                System.out.print(i + " x ");
            }
            if (i == value) {
                result *= i;
                System.out.print(i + " = " + result);
            }
        }
        System.out.println();
    }

    public void forCycle() {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();


        for (int i = 1; i <= value; i++) {
            for (int j = value; j >= 1; j--) {
                if (i * j == value) {
                    System.out.println(i + "*" + j);
                }
            }
        }
    }
}

