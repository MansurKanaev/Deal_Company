import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        // add 1ый вид добавляет значение индекс как в массивах начинается с (0)
        todoList.add("Первое дело");
        todoList.add("Второе дело");
        todoList.add("Четвертое дело");
        // add 2ой вид может заменять место по индексу пример ниже: (3) меняем на (2)
        todoList.add(2, "Третье дело");
        // remove удаляет значение 2 вида по индексу и по значению
        todoList.remove(3);
        todoList.remove("Третье дело");
        // цикл распечатки доб-ых значений
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }

        ArrayList<String> text = new ArrayList<>() {{
            add("Первая задача");
            add("Вторая задача");
        }};
        // простой способ распечатки Arraylist
        for (String s : text) {
            System.out.println(s);
        }


    }
}



