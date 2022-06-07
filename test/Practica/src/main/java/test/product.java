package test;

import java.util.*;

public class product {


    public static void main(String[] args) {
        // буквы
        ArrayList<String> letters = new ArrayList<>();
        // номера
        ArrayList<String> numbers = new ArrayList<>();
        // регион
        ArrayList<String> regions = new ArrayList<>();
        // конечный формат номера
        Set<String> carNumber = new HashSet<>();

        letters.add("A");
        letters.add("В");
        letters.add("E");
        letters.add("К");
        letters.add("M");
        letters.add("Н");
        letters.add("О");
        letters.add("Р");
        letters.add("С");
        letters.add("Т");
        letters.add("У");
        letters.add("Х");

        int l = 12;
        int n = 10;
        int r = 95;

        for (int i = 0; i <= 999; i += 111) {
            if (i == 0) {
                numbers.add(i + "" + i + "" + i);
                continue;
            }
            numbers.add(String.valueOf(i));
        }
        for (int i = 1; i <= 95; i++) {
            if (i < 10) {
                regions.add("0" + i);
                continue;
            }
            regions.add(String.valueOf(i));
        }

        for (int f = 1; f <= 2_000_001; f++) {
            int randomL = (int) (Math.random() * l);
            int randomN = (int) (Math.random() * n);
            int randomR = (int) (Math.random() * r);
            carNumber.add(letters.get(randomL) + numbers.get(randomN) +
                    letters.get(randomL) + letters.get(randomL) + regions.get(randomR));
        }
        System.out.println(carNumber);
        System.out.println(carNumber.size());

    }
}