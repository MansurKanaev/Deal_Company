import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DomParser {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_ELEMENT = "element";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";


    public Root parse() {
        Root root = new Root();
        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.err.println("Error: " + e);
            return null;

        }
        Node rootNode = doc.getFirstChild();
        NodeList rootChilds = rootNode.getChildNodes();
        String mainName = null;
        Node peopleNode = null;
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (rootChilds.item(i).getNodeName()) {
                case TAG_NAME_MAIN: {
                    mainName = rootChilds.item(i).getTextContent();
                    break;
                }
                case TAG_PEOPLE: {
                    peopleNode = rootChilds.item(i);
                    break;
                }
            }
        }
        if (peopleNode == null) {
            return null;
        }
        List<People> peopleList = parsPeople(peopleNode);

        root.setName(mainName);
        root.setPeople(peopleList);
        System.out.println(root.getName());
        root.getPeople().stream().filter(people -> people.getName().equals("Ivan")).forEach(System.out::println);
        root.getPeople().stream().filter(people -> people.getAge() == 20).forEach(System.out::println);

        return root;
    }

    private Document buildDocument() throws Exception {
        File file = new File("test.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }

    private List<People> parsPeople(Node peopleNode) {
        List<People> peopleList = new ArrayList<>();
        NodeList peopleChilds = peopleNode.getChildNodes();

        for (int j = 0; j < peopleChilds.getLength(); j++) {
            if (peopleChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if (!peopleChilds.item(j).getNodeName().equals(TAG_ELEMENT)) {
                continue;
            }
            People people = parsElement(peopleChilds.item(j));
            peopleList.add(people);
        }
        return peopleList;
    }

    private People parsElement(Node elementNode) {
        NodeList elementChilds = elementNode.getChildNodes();
        String name = "";
        int age = 0;
        for (int k = 0; k < elementChilds.getLength(); k++) {
            if (elementChilds.item(k).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (elementChilds.item(k).getNodeName()) {
                case TAG_NAME: {
                    name = elementChilds.item(k).getTextContent();
                    break;
                }
                case TAG_AGE: {
                    age = Integer.parseInt(elementChilds.item(k).getTextContent());
                    break;
                }
            }
        }
        return new People(name, age);
    }
}
