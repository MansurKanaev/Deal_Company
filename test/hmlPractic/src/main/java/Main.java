

public class Main {

    public static void main(String[] args) {
//        DomParser parser = new DomParser();
//        Root root = parser.parse();
//        System.out.println(root);

        
        saxParser saxParser = new saxParser();
        Root root = saxParser.parse();
        System.out.println(root);

    }
}
