import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class primer {
    public static void main(String[] args) {
        ArrayList<String> coolNumbersList = new ArrayList<>();
        ArrayList<String> coolNumbersListWithoutRegion = new ArrayList<>();
        String numberplate;
        String numberplateWithoutRegion;

        char x; // первая буква
        char z; // вторая буква
        char y; // третья буква

        ArrayList<Character> allowedLetters = new ArrayList<>() {{
            add('А');
            add('В');
            add('Е');
            add('К');
            add('М');
            add('Н');
            add('О');
            add('Р');
            add('С');
            add('Т');
            add('У');
            add('Х');
        }};
        Collections.shuffle(allowedLetters, new Random());


        for (Character firstLetter : allowedLetters) {
            x = firstLetter;
            for (int n = 0; n < 10; n++) {
                for (Character secondLetter : allowedLetters) {
                    z = secondLetter;
                    for (Character thirdLetter : allowedLetters) {
                        y = thirdLetter;
                        numberplateWithoutRegion = String.format("%c%d%d%d%c%c", x, n, n, n, z, y);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }

        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            for (int j = 1; j <= 199; j++) {
                if (j <= 9) {
                    numberplate = String.format("%s0%d", numberWithoutRegion, j);
                } else {
                    numberplate = String.format("%s%d", numberWithoutRegion, j);
                }
                coolNumbersList.add(numberplate);
                if(coolNumbersList.size()<=10000){
                    System.out.println(coolNumbersList);
                    break;
                }
            }

        }
        Collections.shuffle(coolNumbersList, new Random());
        System.out.println(coolNumbersList.size());
    }
}
