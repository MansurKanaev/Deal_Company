import java.util.Scanner;

public class randomNumber {

    public void randomNum() {
        System.out.println("Угадайте загаданное число от 0 до 100");
        System.out.println("Введите число: ");
        int y = (int) (Math.random() * 101);
        int attempt = 0;

        while (true) {
            int x = new Scanner(System.in).nextInt();
            if (x < 0 || x > 100) {
                System.out.println("Ошибка");
                continue;
            }
            attempt += 1;
            if (x > y) {
                System.out.println("Меньше введенного)");
            }
            if (x < y) {
                System.out.println("Больше введенного)");
            }
            if (x == y) {
                System.out.println("Вы угадали, это число: " + y + " Попыток: " + attempt);
                break;
            }
        }
    }
}
