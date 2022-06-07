package lambda;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Spargalka_stream_api {
    // Метод Map изменяет выборку по определенному правилу, возвращает stream с новой выборкой
    public static void main(String[] args) throws IOException {
        testMap();
        testMapToInt();
        testFlatMap();
        testFlatMapToInt();

        System.out.println("Test buildStream start");

        // Создание стрима из значений
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        System.out.println("streamFromValues = " + streamFromValues.collect(Collectors.toList())); // напечатает streamFromValues = [a1, a2, a3]

        // Создание стрима из массива
        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        System.out.println("streamFromArrays = " + streamFromArrays.collect(Collectors.toList())); // напечатает streamFromArrays = [a1, a2, a3]

        Stream<String> streamFromArrays1 = Stream.of(array);
        System.out.println("streamFromArrays1 = " + streamFromArrays1.collect(Collectors.toList())); // напечатает streamFromArrays = [a1, a2, a3]

        // Создание стрима из файла (каждая запись в файле будет отдельной строкой в стриме)
        File file = new File("1.tmp");
        file.deleteOnExit();
        PrintWriter out = new PrintWriter(file);
        out.println("a1");
        out.println("a2");
        out.println("a3");
        out.close();

        Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
        System.out.println("streamFromFiles = " + streamFromFiles.collect(Collectors.toList())); // напечатает streamFromFiles = [a1, a2, a3]

        // Создание стрима из коллекции
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();
        System.out.println("streamFromCollection = " + streamFromCollection.collect(Collectors.toList())); // напечатает streamFromCollection = [a1, a2, a3]

        // Создание числового стрима из строки
        IntStream streamFromString = "123".chars();
        System.out.print("streamFromString = ");
        streamFromString.forEach((e)->System.out.print(e + " , ")); // напечатает streamFromString = 49 , 50 , 51 ,
        System.out.println();

        // С помощью Stream.builder
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamFromBuilder = builder.add("a1").add("a2").add("a3").build();
        System.out.println("streamFromBuilder = " + streamFromBuilder.collect((Collectors.toList()))); // напечатает streamFromFiles = [a1, a2, a3]

        // Создание бесконечных стримов
        // С помощью Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
        System.out.println("streamFromIterate = " + streamFromIterate.limit(3).collect(Collectors.toList())); // напечатает streamFromIterate = [1, 3, 5]

        // С помощью Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        System.out.println("streamFromGenerate = " + streamFromGenerate.limit(3).collect(Collectors.toList())); // напечатает streamFromGenerate = [a1, a1, a1]

        // Создать пустой стрим
        Stream<String> streamEmpty = Stream.empty();
        System.out.println("streamEmpty = " + streamEmpty.collect(Collectors.toList())); // напечатает streamEmpty = []

        // Создать параллельный стрим из коллекции
        Stream<String> parallelStream = collection.parallelStream();
        System.out.println("parallelStream = " + parallelStream.collect(Collectors.toList())); // напечатает parallelStream = [a1, a2, a3]



    }

    // Метод collect преобразует stream в коллекцию или другую структуру данных
    // Полезные статические методы из Collectors:
    // toList, toCollection, toSet - представляют стрим в виде списка, коллекции или множества
    // toConcurrentMap, toMap - позволяют преобразовать стрим в map, используя указанные функции
    // averagingInt, averagingDouble, averagingLong - возвращают среднее значение
    // summingInt, summingDouble, summingLong - возвращает сумму
    // summarizingInt, summarizingDouble, summarizingLong - возвращают SummaryStatistics с разными агрегатными значениями
    // partitioningBy - разделяет коллекцию на две части по соответствию условию и возвращает их как Map<Boolean, List>
    // groupingBy - разделить коллекцию по условию и вернуть Map<N, List<T>>, где T - тип последнего стрима, N - значение разделителя
    // mapping - дополнительные преобразования значений для сложных Collector'ов

    private static void testCollect() {
        System.out.println();
        System.out.println("Test distinct start");

        // ******** Работа со строками
        Collection<String> strings = Arrays.asList("a1", "b2", "c3", "a1");

        // Получение списка из коллекции строк без дубликатов
        List<String> distinct = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct = " + distinct); // напечатает distinct = [a1, b2, c3]

        // Получение массива уникальных значений из коллекции строк
        String[] array = strings.stream().distinct().map(String::toUpperCase).toArray(String[]::new);
        System.out.println("array = " + Arrays.asList(array)); // напечатает array = [A1, B2, C3]

        // Объединить все элементы в одну строку через разделитель: и обернуть тегами <b> ... </b>
        String join = strings.stream().collect(Collectors.joining(" : ", "<b> ", " </b>"));
        System.out.println("join = " + join); // напечатает <b> a1 : b2 : c3 : a1 </b>

        // Преобразовать в map, где первый символ ключ, второй символ значение
        Map<String, String> map = strings.stream().distinct().collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
        System.out.println("map = " + map); // напечатает map = {a=1, b=2, c=3}

        // Преобразовать в map, сгруппировав по первому символу строки
        Map<String, List<String>> groups = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
        System.out.println("groups = " + groups); // напечатает groups = {a=[a1, a1], b=[b2], c=[c3]}

        // Преобразовать в map, сгруппировав по первому символу строки и в качестве значения взять второй символ объединим через:
        Map<String, String> groupJoin = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1), Collectors.mapping((p) -> p.substring(1, 2), Collectors.joining(":"))));
        System.out.println("groupJoin = " + groupJoin); // напечатает groupJoin = groupJoin = {a=1/1, b=2, c=3}

        // ******** Работа с числами
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // Получить сумму нечетных чисел
        long sumOdd = numbers.stream().mapToInt(((p) -> p % 2 == 1 ? p : 0)).sum();
        System.out.println("sumOdd = " + sumOdd); // напечатает sumEven = 4

        // Вычесть с каждого элемента 1 и получить среднее
        double average = numbers.stream().collect(Collectors.averagingInt((p) -> p - 1));
        System.out.println("average = " + average); // напечатает average = 1.5

        // Прибавить к числам 3 и получить статистику
        IntSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingInt((p) -> p + 3));
        System.out.println("statistics = " + statistics); // напечатает statistics = IntSummaryStatistics{count=4, sum=22, min=4, average=5.500000, max=7}

        // Получить сумму четных чисел через IntSummaryStatistics
        long sumEven = numbers.stream().collect(Collectors.summarizingInt((p) -> p % 2 == 0 ? p : 0)).getSum();
        System.out.println("sumEven = " + sumEven); // напечатает sumEven = 6

        // Разделить числа на четные и нечетные
        Map<Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy((p) -> p % 2 == 0));
        System.out.println("parts = " + parts); // напечатает parts = {false=[1, 3], true=[2, 4]}
    }

    private static void testMap() {

        System.out.println();
        System.out.println("Test map start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Изменение всех элементов коллекции
        List<String> transform = collection.stream().map((s) -> s + "_1").collect(Collectors.toList());
        System.out.println("transform = " + transform); // напечатает transform = [a1_1, a2_1, a3_1, a1_1]

        // убрать первый символ и вернуть числа
        List<Integer> number = collection.stream().map((s) -> Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println("number = " + number); // напечатает transform = [1, 2, 3, 1]

    }

    // Метод MapToInt - изменяет выборку по определенному правилу, возвращает stream с новой числовой выборкой
    private static void testMapToInt() {
        System.out.println();
        System.out.println("Test mapToInt start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // убрать первый символ и вернуть числа
        int[] number = collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println("number = " + Arrays.toString(number)); // напечатает number = [1, 2, 3, 1]

    }

    // Метод FlatMap - похоже на Map - только вместо одного значения, он возвращает целый stream значений
    private static void testFlatMap() {
        System.out.println();
        System.out.println("Test flat map start");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        // получить все числовые значения, которые хранятся через запятую в collection
        String[] number = collection.stream().flatMap((p) -> Arrays.stream(p.split(","))).toArray(String[]::new);
        System.out.println("number = " + Arrays.toString(number)); // напечатает number = [1, 2, 0, 4, 5]
    }

    // Метод FlatMapToInt - похоже на MapToInt - только вместо одного значения, он возвращает целый stream значений
    private static void testFlatMapToInt() {
        System.out.println();
        System.out.println("Test flat map start");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        // получить сумму всех числовые значения, которые хранятся через запятую в collection
        int sum = collection.stream().flatMapToInt((p) -> Arrays.stream(p.split(",")).mapToInt(Integer::parseInt)).sum();
        System.out.println("sum = " + sum); // напечатает sum = 12
    }

    // Метод reduce позволяет выполнять агрегатные функции на всей коллекцией (такие, как сумма, нахождение минимального или максимального значение и т.п.)
    // Он возвращает одно Optional значение
    // map - преобразует один объект в другой (например, класс одного тип в другой)
    // mapToInt - преобразование объектов в числовой стрим (стрим, состоящий из значений int)
    private static void testReduce() {
        System.out.println();
        System.out.println("Test reduce start");

        // ************ Работа с числовыми объектами
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 2);

        // Вернуть сумму
        Integer sum = collection.stream().reduce(Integer::sum).orElse(0); // через stream Api
        Integer sumOld = 0; // по старому методу
        for(Integer i: collection) {
            sumOld += i;
        }
        System.out.println("sum = " + sum + " : " + sumOld); // напечатает sum = 12 : 12


        // Вернуть максимум
        Integer max1 = collection.stream().reduce((s1, s2) -> s1 > s2 ? s1 : s2).orElse(0); // через stream Api
        Integer max2 = collection.stream().reduce(Integer::max).orElse(0); // через stream Api используя Integer::max
        Integer maxOld = null; // по старому методу
        for(Integer i: collection) {
            maxOld = maxOld != null && maxOld > i? maxOld: i;
        }
        maxOld = maxOld == null? 0 : maxOld;
        System.out.println("max = " + max1 + " : " + max2 + " : " + maxOld); // напечатает max1 = 4 : 4 : 4

        // Вернуть минимум
        Integer min = collection.stream().reduce((s1, s2) -> s1 < s2 ? s1 : s2).orElse(0); // через stream Api
        Integer minOld = null; // по старому методу
        for(Integer i: collection) {
            minOld = minOld != null && minOld < i? minOld: i;
        }
        minOld = minOld == null? 0 : minOld;
        System.out.println("min = " + min+ " : " + minOld); // напечатает min = 1 : 1

        // Вернуть последний элемент
        Integer last = collection.stream().reduce((s1, s2) -> s2).orElse(0); // через stream Api
        Integer lastOld = null; // по старому методу
        for(Integer i: collection) {
            lastOld = i;
        }
        lastOld = lastOld == null? 0 : lastOld;
        System.out.println("last = " + last + " : " + lastOld); // напечатает last = 2 : 2

        // Вернуть сумму чисел, которые больше 2
        Integer sumMore2 = collection.stream().filter(o -> o > 2).reduce(Integer::sum).orElse(0);     // через stream Api
        int sumMore2Old = 0; // по старому методу
        for(Integer i: collection) {
            if(i > 2) {
                sumMore2Old += i;
            }
        }
        System.out.println("sumMore2 = " + sumMore2 + " : " + sumMore2Old); // напечатает sumMore2 = 7 : 7

        // Вернуть сумму нечетных чисел
        Integer sumOdd = collection.stream().filter(o -> o % 2 != 0).reduce(Integer::sum).orElse(0); // через stream Api
        int sumOddOld = 0; // по старому методу
        for(Integer i: collection) {
            if(i % 2 != 0) {
                sumOddOld += i;
            }
        }
        System.out.println("sumOdd = " + sumOdd + " : " + sumOddOld); // напечатает sumOdd = 4 : 4

        // ************ Работа со сложными объектами

        // Зададим коллекцию людей
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );

        // Найдем самого старшего мужчину
        int oldMan = peoples.stream().filter((p) -> p.getSex() == Sex.MAN).map(People::getAge).reduce((s1, s2) -> s1 > s2 ? s1 : s2).get();
        System.out.println("oldMan = " + oldMan); // напечатает 69

        // Найдем самого минимальный возраст человека у которого есть бука е в имени
        int younger = peoples.stream().filter((p) -> p.getName().contains("е")).mapToInt(People::getAge).reduce(Math::min).orElse(0);
        System.out.println("younger = " + younger); // напечатает 23


    }

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class People {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public People(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof People)) return false;
            People people = (People) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }
}

