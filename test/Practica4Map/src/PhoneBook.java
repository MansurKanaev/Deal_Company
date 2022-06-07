import java.util.*;

public class PhoneBook {

    private Map<String, String> phoneList = new TreeMap<>();
    String nameFormat = "[\\D-]+";
    String numberFormat = "^[7-8][\\d]{10}";

    public void addContact(String name, String phone) {



    }

    public String getContactByName(String name) {

        return "";
    }

    public String getContactByPhone(String phone) {

        return phone;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> phoneSet = new TreeSet<>();
        for (Map.Entry<String, String> item : phoneList.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
        return phoneSet;
    }

}
