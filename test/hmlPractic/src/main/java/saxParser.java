import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class saxParser {
    public Root parse() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        File file = new File("test.xml");
        try {
            assert parser != null;
            parser.parse(file, handler);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        return handler.getRoot();
    }
}
