import org.w3c.dom.ls.LSOutput;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.StringJoiner;

public class line {
    public static void main(String[] args) {
        // проверка длины строки является ли строка пустой
        String empty = "";
        String blank = "\n \t  ";
        boolean isEmpty = empty.length() == 0;
        System.out.println(empty.isEmpty());
        System.out.println(isEmpty);
        // проверка является ли строка пустой даже когда в нем есть отступы или пробелы empty.isBlank()
        System.out.println(blank.isBlank());



        // Объединения двух и более строк в одну называется - конкатенация строк
        // Конкатенация строк можно использовать 3 способа:
        // 1 ый способ обычный "+"
        String name = "Maks";
        String serName = "Kowalski";
        String fullName = name + " " + serName;
        System.out.println(fullName);
        // 2ой способ, если множество повторяющихся строк конкатенаций
        StringBuilder text = new StringBuilder();
        String word = "";
        text.append(word);
        // 3ий способ
        String personInfo = name.concat(" - ").concat(serName);
        System.out.println("   " + personInfo);
        // При сравнении строк не использовать "==", а использовать метод equals()

        // Преобразование чисел в строки
        // 1 неявное при конкатенации
        // 2  Integer.toString()
        int age = 37;
        String name9 = "Анна";
        String value = Integer.toString(age);
        System.out.println(value);
        // 3 Double.toString()
        double age1 = 3.23;
        String value1  = Double.toString(age1);
        System.out.println(value1);
        // 4 String.valueOf(value)
        String value2 = String.valueOf(value);
        System.out.println(value2);

        // Преобразование строку в число
        //Методы парсинга у классов-чисел:
        //Integer.parseInt()
        String sot = "21344";
        int cor = Integer.parseInt(sot);
        System.out.println(cor);
        //Double.parseDouble()
        double wer = Double.parseDouble(sot);
        System.out.println(wer);
        //Числа в строках должны соответствовать классам, методы
        //которых мы используем для парсинга, иначе может произойти
        //NumberFormatException.


        // Символы и кодировки

        // получить первый символ строки методом charAt()
        String line = "342345";
        char symbol = line.charAt(0);
        System.out.println(symbol);
        // проверка яв-ся ли первый символ в строке числом методом Character.isDigit
        System.out.println(Character.isDigit(symbol));


        // проверка с помощью цикла как узнать сколько символов в тексте
        // length - это метод, который возвращает длину строки т.е проходится по всей длине строки
        String text1 = "Жил был дед со своею старухой и был у них колобок";
        int spaceCount = 0;
        for (int i = 0; i < text1.length(); i++) {
            char symbol1 = text1.charAt(i);
            if (symbol1 == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов в тексте: " + spaceCount);

        // метод trim() убирает пробелы отступы переносы по краям текста

        String name0 = "\n Max \t ";
        System.out.println(name0.trim());

        // виды кодировок  StandardCharsets.US_ASCII, StandardCharsets.UTF_16

        String set = "Lets go ребята */!№$#@ ";
        String encodedSet = new String(set.getBytes(), StandardCharsets.ISO_8859_1);
        System.out.println(encodedSet);

        // метод .join / Joiner для объединения строк в одну

        String name1 = "Дима";
        String name2 = "Саня";
        String name3 = "Вова";
        String list = String.join(", ", name1, name2, name3);
        System.out.println("9: " + list);

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println( joiner);

        // Форматирование строк специальными символами %s - строка / %d - целое число
        // %f число float или double / %b  boolean / %n перенос строки / %t дата (Date) / %% символ процента
        String nam = "Maks";
        int birthYear = 1986;
        // {"name" : "Maks", "birthYear" : "1986"}
        String template = "{\"name\" : \"%s\", \"birthYear\" : \"%d\"}";
        String result = String.format(template, nam, birthYear);
        System.out.println("11: " + result);
        System.out.printf(template, nam, birthYear);


        // Методы работы с подстроками
        // метод   .indexOf(".txt") / .indexOf(".txt", from) - который позволяет найти сначала строки подстроку в строке ее позицию,
        // если она не найдена он возвращает -1
        // метод lastIndexOf(".txt") /  lastIndexOf(".txt", from) - тоже что и индекс оф только ищет с конца строки
        // метод subString(from) / subString (from, to) - который когда с 1 параметром начинает искать в тексте с выбранного параметра и до конца строки
        // и когда 2 параметра выделяет от и до какого-то символа

        //  цикл как из подстроки вытащить часть строки

        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";
        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";

        System.out.println("12: " + getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));
    }

    public static String getEncoding(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(';', start);
        if (start < 0 || end < 0) {
            return "";
        }
        return header.substring(start + charsetStr.length(), end);
    }
}
