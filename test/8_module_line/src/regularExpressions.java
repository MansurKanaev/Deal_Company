import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressions {
    public static void main(String[] args) {
        // Замена или добавление символов через regex
        String s = "09072016 154915";
        // что ищем:
        String rx = "(\\d{2})(\\d{2})(\\d{4})\\s+(\\d{2})(\\d{2})(\\d{2})";
        Pattern pattern1 = Pattern.compile(rx);
        Matcher matcher2 = pattern1.matcher(s);
        StringBuilder strbuf = new StringBuilder();
        while (matcher2.find()) {
            // на что меняем:
            matcher2.appendReplacement(strbuf, "$1-$2-$3 $4:$5:$6");
        }
        matcher2.appendTail(strbuf);
        // Result: 09-07-2016 15:49:15
        System.out.println("Result: " + strbuf);

        // регулярка для проверки соответствия строки
        String number = "А677МР197";
        String lettersList = "[АВЕКМНОРСТУХ]";
        String regex = lettersList + "[0-9]{3}" + lettersList + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex));
        if (number.matches(regex)) {
            System.out.println("Номер введен верно: " + number);
        } else {
            System.out.println("Неверный формат номера!");
        }
        // Поиск соответствий в строке
        String text = "Алексей, добрый день! \nМой гитхаб - https://github.com/, а также ссылка на мой" +
                "персональный сайт - https://www.skillbox.ru/\nЕсли возникнут вопросы, пишите мне напрямую." +
                "Я всегда доступен";
        String regex1 = "https:\\/\\/[^,\\s]+";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
        // Разбиение строки на фрагменты
        String text1 = "I   know    something  about    it";
        String[] words = text1.split("\\s+");
        for (String word : words) { // int  i = 0; i < words.length; i++
            System.out.println(word);   // System.out.println(words[i]);
        }
        // Замена в строке одних фрагментов на другие
        String phone1 = "7 984 430-43-23";
        String phone2 = "7 (938) 978-21-65";
        String phone3 = "7999-543-76-87";
        String phone4 = "7(928)9874532";
        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
    }

    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]";
        return phone.replaceAll(regex, "");
    }

    /** Регулярные выражения
     *  [abc] - набор символов
     *  [^abc] - отрицание
     *  [0-9] - диапазон
     *  \s - пробельный символ
     *  n+ - один или несколько символов
     *  n* - ноль, один или несколько символов
     *  n? - ноль или один символ
     *  n{5} -  5 раз
     *  n{5,} - 5 и более раз
     *  n{5,8} - 5-8 раз
     */

}

