package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        String text = "hello 2 to swim small to";
        list.add(text);
        list.add("go");
        list.add("run");
        list.add(3, "321");
        System.out.println(list.size());
//        String[] words = text.split(" ", 3);
//
//        for (String s : words) {
//            System.out.println(s + "\n");
//        }
//
//        System.out.println(words[1] + " - " + words[2]);


//        Elevator elevator = new Elevator(-3, 26);
//        System.out.println("Введите номер этажа от -3 до 26");
//        while (true) {
//            String input = new Scanner(System.in).next();
//            int floor = Integer.parseInt(input);
//            elevator.move(floor);
//            if(input.isEmpty()){
//                break;
//            }
    }
}
