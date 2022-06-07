import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class dateTame {
    public static void main(String[] args) {
        // 7.8 Дата и время:

        //1 Для отображения только даты:
        LocalDate today = LocalDate.now();
        System.out.println("1 Пример: " + today + "\n");

        //2 Для отображения даты и времени
        LocalDateTime now = LocalDateTime.now();
        System.out.println("2 Пример: " + now + "\n");

        //3 Для отображения определенной даты с последующим ввода числа и изменения даты после этого числа
        LocalDate birthday = LocalDate.of(1998, 8, 11);
        System.out.println("3 Пример: " + birthday.plusYears(24) + "\n");

        //4 Для отображения даты и времени страны или города:
        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("4 Пример: " + nowNY + "\n");

        //5 Преобразование строки в объект:
        String date = "09/10/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println("5 Пример: " + localDate + "\n");

        //6 Преобразование объекта в строку
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("6 Пример: " + formatter1.format(now1) + "\n");

        //7 облегченный вариант
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("7 Пример: " + formatter2.format(now2) + "\n");

        //8 облегченный вариант и смена формата при выводе кода
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .localizedBy(new Locale("us"));
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println("8 Пример: " + formatter3.format(now3) + "\n");

        //9 Сравнение дат, если 1-ая дата больше, код выдаст положительно значение,
        // если одинаковы то 0, если меньше то отрицательно значение
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(3);
        System.out.println("9 Пример: " + time1.compareTo(time2) + "\n");

        //10 Вычисления разницы между датами
        LocalDateTime time3 = LocalDateTime.now();
        LocalDateTime time4 = time3.minusDays(1);
        System.out.println("10 Пример: " + time3.until(time4, ChronoUnit.DAYS) + "\n");

        //11 Формат даты другого региона US
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(new Locale("us"));
        LocalDateTime n = LocalDateTime.now();
        System.out.println("11 пример: " + f.format(n));
        // Метка времени (timestamp) - это количество секунд, прошедших
        // с 00:00:00 01 января 1970 года

        // Метка времени в Java
        // Код для измерения длительности программного кода это нужно прописать в классе майн
        long start = System.currentTimeMillis();
        String line = "";
        for (int i = 0; i < 100; i++) {
            line += Math.random();
        }
        System.out.println(System.currentTimeMillis() - start);

        // Преобразование timestamp в дату
        LocalDateTime day = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0,
                ZoneOffset.ofHours(3));
        System.out.println(day);

        // Преобразование дату в timestamp
        // Преобразование timestamp в дату
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.toEpochSecond(ZoneOffset.ofHours(3)));
    }
}
