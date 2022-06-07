package hw4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String htmlFile = parseFile("data/code.html");

        Document document = Jsoup.parse(htmlFile);
        Elements elements = document.select("meta");
//        elements.forEach(System.out::println);
        elements.forEach(element -> {
            System.out.println(element.text());
        });

    }

    public static String parseFile(String path) {
        StringBuilder builder = new StringBuilder();

        try {
            List<String> list = Files.readAllLines(Paths.get(path));
            list.forEach(line -> builder.append(line).append("\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
