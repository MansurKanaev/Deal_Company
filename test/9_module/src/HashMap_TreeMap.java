import java.util.*;

public class HashMap_TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>();
        // добавление пар ключ значений в мап
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // получим значение по ключу
        String first = states.get(2);
        System.out.println("Получить по ключу №2: " + first);

        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        System.out.println("Все ключи: " + keys);

        // получить набор всех значений
        Collection<String> values = states.values();
        System.out.println("Все значения: " + values);

        //заменить элемент
        states.replace(1, "Poland");

        // удаление элемента по ключу 2
        states.remove(2);

        // получим размер мапы
        System.out.println("Размер мапы: " + states.size());

        // булен поиск ключа по всем К
        if (states.containsKey(1)) {
            System.out.println("Есть такой город");
        }
        // булен поиск значений по всем V
        if (states.containsValue("Moscow")) {
            System.out.println("Есть такой город");
        } else {
            System.out.println("Нет такого города");
        }

        // перебор элементов
        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.println("Ключ: " + item.getKey() + " Значение: " + item.getValue());
        }

        //Создание новой хеш-карты и копирование
        Map<Integer, String> new_hash_map = new HashMap<>(states);
        System.out.println("Новая карта выглядит так: " + new_hash_map);

        // очистка
        states.clear();
        System.out.println("После очистки: " + states);



    }

}


//        Map<String, Integer> basket = new TreeMap<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.equals("0")) {
//                break;
//            }
//            if (!input.equals("LIST")) {
//                System.out.println("Добавлен(а) \"" + input + "\" в корзину");
//            }
//            if (input.equals("LIST")) {
//                printMap(basket);
//                continue;
//            }
//            int count = 1;
//            if (basket.containsKey(input)) {
//                count = basket.get(input) + 1;
//            }
//            basket.put(input, count);
//            if (input.equals("сок")) {
//                basket.replace(input, 3);
//            }
//            if (input.equals("молоко")) {
//                basket.remove("молоко", 2);
//            }
//        }
//    }
//
//    private static void printMap(Map<String, Integer> map) {
//        for (String key : map.keySet()) {
//            System.out.println(key + " = " + map.get(key));
//        }
//    }

