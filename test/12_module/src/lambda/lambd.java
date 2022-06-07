package lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lambd {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(a);
        intStream.forEach(System.out::println);

        Stream.of("1", "22", "333", "shot")
                .map(String::length)
                .map((i -> i * 4))
                .peek(x -> System.out.println("peek: " + x))
                .map(String::valueOf)
                .map(String::length)
                .forEach(System.out::println);

//        Stream.of("ski", "ll", " ", "", "box")
//                .filter(s -> !s.isBlank())
//                .forEach(System.out::print);

//        Stream.of("ski", "ll", " ", "", "box")
//                .filter(Predicate.not(String::isBlank))
//                .forEach(System.out::print);

//        Stream.of("ski", "ll", " ", "", "box","skit", "pill")
//                .filter(Predicate.isEqual("ski"))
//                .forEach(System.out::print);

//        Random random = new Random();
//        Stream.generate(() -> random.nextInt(6))
//                .limit(10)
//                .distinct()
//                .map(x -> ++x)
//                .forEach(System.out::println);

//        Stream.of("skillbox", "java", "boll", "came", "amount", "milk")
//                .sorted()
//                .forEach(System.out::println);

//Stream.of(List.of(3,4,5), List.of(0), List.of(1,2))
//        .sorted(Comparator.comparing(List::size))
//        .forEach(System.out::println);

//        Optional<Integer> max = Stream.of(1, 2, 3, 4, 11)
//                .filter(integer -> integer > 10)
//                .max(Integer::compare);
//
//        if (max.isPresent()) {
//            System.out.println(max.get());
//        } else {
//            System.out.println("Не найдено!");
//        }

//        int m = Stream.of(1,2,3,4,10)
//                .filter(i -> i > 10)
//                .max(Integer::compare)
//                .orElse(0);
//        System.out.println(m);

//        // .anyMatch возвращает true, если найден хотя бы один элемент соответствующий условию
//        boolean hasMoreThan10 = Stream.of(1, 2, 3, 4)
//                .anyMatch(i -> i > 10); // false
//
//        // .noneMatch возвращает true, если все элементы  не соответствующий условию
//        boolean hasMoreThan11 = Stream.of(1, 2, 3, 4)
//                .noneMatch(i -> i > 10); // true
//
//        // .allMatch возвращает true, если все элементы   соответствуют условию
//        boolean hasMoreThan12 = Stream.of(1, 2, 3, 4)
//                .allMatch(i -> i > 10); // false

//        Map<String, Integer> map = Stream.of("a", "a", "b", "a", "b", "c", "a", "b", "i", "c")
//                .collect(Collectors.toMap(
//                        Function.identity(),
//                        (s) -> 1,
//                        ((integer, integer2) -> ++integer)));
//        System.out.println(map);

        // // группировка данных, для получения Map Подсчет количества элементов через группировку данных
//        Map<String, Long> map = Stream.of("a", "a", "b", "c", "b")
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map);

        //  // Собрать элементы с одинаковым признаком в List;

        Map<Integer, List<Person>> map =
                Stream.of(new Person("2"), new Person("3"), new Person("44"), new Person("55"))
                        .collect(Collectors.groupingBy(person -> person.getPhone().length()));
        System.out.println(map);

    }

    public static class Person {
        private final String phone;

        public Person(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

        public String toString() {
            return "Person {" + "phone='" + phone + '\'' + '}';
        }
    }


}
