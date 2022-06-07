package lambda;


import java.util.*;
import java.util.stream.Collectors;

public class p {
    public static void main(String[] args) {




    }


    class Task3GroupByTest {

        Employee a = new Employee("Boris", "Google");
        Employee b = new Employee("Misha", "Google");
        Employee c = new Employee("Lena", "Microsoft");
        List<Employee> employees = Arrays.asList(a, b, c);
    }

    public static class Employee {
        private String name;
        private String company;

        public Employee(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public String getCompany() {
            return company;
        }
    }


}

