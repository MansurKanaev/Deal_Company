import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
//        JsonPars pars = new JsonPars();
//        Root root = pars.parse();
//        System.out.println(root);

        Person person = new Person("Sasha", 30, Arrays.asList("Moscow", "New York", "Dubai"));
        String json = GSON.toJson(person);
        System.out.println(json);
    }
}

class Person {
    private String name;
    private Integer age;
    private List<String> geoHistory = new ArrayList<>();

    public Person(String name, Integer age, List<String> geoHistory) {
        this.name = name;
        this.age = age;
        this.geoHistory = geoHistory;
    }
}
