package hw2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {



    }
}


//        try {
//            PrintWriter writer = new PrintWriter("data/text.txt");
//            for (int i = 0; i < 1000; i++) {
//                writer.write(i + "\n");
//            }
//            writer.flush();
//            writer.close();
//
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }

//        System.out.println(move());
//    }
//    public static String move(){
//        File orig = new File("F:\\Downloads\\text.txt");
//        File cop = new File("F:\\Downloads\\copy.txt");
//
//        try {
//            Files.move(orig.toPath(), cop.toPath());
//            return "Данные перенесены с ветки : " + orig + " до ветки: " + cop;
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        return "Ошибка";
//    }

