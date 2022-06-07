package hw1;

import java.io.File;
import java.io.IOException;

public class stock {
    double size = 0.0;


    public static double getSize(File file) {
        // Определяем, существует ли файл
        if (file.exists()) {
            // Если это каталог, рекурсивно вычисляем общий размер его содержимого,
            // если это файл, напрямую возвращаем его размер
            if (!file.isFile()) {
                // Получить размер файла
                File[] fl = file.listFiles();
                double ss = 0;
                assert fl != null;
                for (File f : fl)
                    ss += getSize(f);
                return ss;
            } else {
                double ss = (double) file.length() / 1024 / 1024;
                System.out.println(file.getName() + " : " + ss + "MB");
                return ss;
            }
        } else {
            System.out.println("Файл или папка не существует, проверьте правильность пути!");
            return 0.0;
        }
    }

    public static void main(String[] args) throws IOException {

        double all = stock.getSize(new File("F:\\Games"));
        System.out.println("ALL:  " + all + "MB");

    }
}

