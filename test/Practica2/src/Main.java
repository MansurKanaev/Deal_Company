

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> location = new ArrayList<>();

    public static void main(String[] args) {
        DotCom dot = new DotCom();
        int randomNum = (int) (Math.random() * 21);
        location.add(randomNum);
        location.add(randomNum + 1);
        location.add(randomNum + 2);
        dot.setLocationCell(location);
        int i = 0;
        System.out.println("Привет, это игра морской бой потопи 3ех палубный " +
                "\nкорабль за наименьшее количество попыток удачи тебе :)!");
        while (true) {
            i++;
            System.out.print("Введите число от 0 до 25:\n");
            int userGuess = new Scanner(System.in).nextInt();
            String result = dot.checkYourself(userGuess);
            if (result.equals("Потопил")) {
                System.out.println("Всего потребовалось " + i + " хода(ов).");
                break;
            }
        }
    }
}


