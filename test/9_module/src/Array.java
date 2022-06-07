import java.util.Random;

public class Array {
    public static void main(String[] args) {
        // массивы 1 ый способ

        int[] roomCounts = new int[6];
        roomCounts[0] = 5;
        roomCounts[1] = 10;
        roomCounts[2] = 15;
        roomCounts[3] = 20;
        for (int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }

        // 2ой способ
        int[] numbers = {4, 5, 6, 7, 8};
        System.out.println(numbers[0]);

        // пример строки
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }


        // перебор элементов массивов

        int[] ticketNumbers = new int[1000];
        int[] winTickets = new int[10];

        for (int i = 0; i < ticketNumbers.length; i++) {
            int value = 1000000 + (int) Math.round(1000000 * Math.random());
            ticketNumbers[i] = value;

            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }
        }
        // 10 билетов победителей
        for (int winTicketNumber : winTickets) {
            System.out.println(winTicketNumber);
        }
        // Обход массивов в обратном порядке
        String text1 = "Каждый охотник желает знать, где сидит фазан";
        String[] colors1 = text1.split(",?\\s+");
        for (int i = colors1.length - 1; i >= 0; i--) {
            System.out.println("1 " + colors1[i]);
        }
        System.out.println();

        String text2 = "Каждый Каждый охотник желает знать, где где сидит фазан";
        String[] colors2 = text2.split(",?\\s+");
        for (int i = 0; i < colors2.length; i++) {
            if (i > 0 && colors2[i].equals(colors2[i - 1])) {
                continue;
            }
            System.out.println(colors2[i]);
        }

        String str = "a really, really long string";
        for (int i = 0, n = str.length(); i < n; i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }

        //  Массивы массивов

        int[][] studentsMarks = {
                {4, 5, 3, 2, 3},
                {2, 3, 5, 4, 3, 5, 4, 5},
                {5, 4, 3, 2, 4, 3, 2},
                {3, 4, 5, 2}
        };
        for (int z = 0; z < studentsMarks.length; z++) {
            System.out.println("Class " + z + " (" + studentsMarks[z].length + " student):");
            for (int j = 0; j < studentsMarks[z].length; j++) {
                System.out.println("\t" + studentsMarks[z][j]);
            }


            char symbol = 'X';
            char empty = ' ';
            char[][] array = new char[5][5];
            int line = array.length;

            for (int i = 0; i < line; i++) {
                array[i][i] = symbol;
                array[i][line - 1 - i] = symbol;
            }
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < line; j++) {
                    if (!(array[i][j] == symbol)) {
                        array[i][j] = empty;
                    }
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

        }
        int[][] twoArray = new int[3][3];
        int lineArray = twoArray.length * twoArray.length;

        twoArray[0][0] = 1;
        twoArray[0][1] = 2;
        twoArray[0][2] = 3;
        twoArray[1][0] = 4;
        twoArray[1][1] = 5;
        twoArray[1][2] = 6;
        twoArray[2][0] = 7;
        twoArray[2][1] = 8;
        twoArray[2][2] = 9;

        //  было

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {

                System.out.print(twoArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // вывод после стало

        int side = twoArray.length;
        int[][] result = new int[side][side];

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                result[i][j] = twoArray[side - j - 1][i];

                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
