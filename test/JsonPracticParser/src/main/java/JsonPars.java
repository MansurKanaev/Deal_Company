import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonPars {
    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";

    public Root parse() {

        Root root = new Root();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("src/main/resources/list.json")) {
            JSONObject obj = (JSONObject) parser.parse(reader);
            String name = (String) obj.get(TAG_NAME_MAIN);
            JSONArray array = (JSONArray) obj.get(TAG_PEOPLE);
            List<People> peopleList = new ArrayList<>();
            for (Object it : array) {
                JSONObject jsonObject = (JSONObject) it;
                String namePeople = (String) jsonObject.get(TAG_NAME);
                long age = (long) jsonObject.get(TAG_AGE);

                People people = new People(namePeople, age);
                peopleList.add(people);
            }
            root.setName(name);
            root.setPeople(peopleList);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return root;
    }
}
