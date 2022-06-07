import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        String nameFormat = "[\\D]+";
        String numberFormat = "^[7-8][\\d]{10}";
        String list = "LIST";
        String nameAndNumber = "(^[\\w]+\\s[7-8]\\d{10}|^[7-8]\\d{10}\\s[\\w]+$)";
        String name;
        String number;
        System.out.println("Привет это телефонная книга) Введите имя или номер чтоб сохранить контакт!");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else if (input.matches(list)) {

            } else if (input.matches(nameFormat)) {

            } else if (input.matches(numberFormat)) {

            }
        }
    }
}
