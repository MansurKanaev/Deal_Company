package hw3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) {
        String path = "/Users/Mansur/Desktop/";
//      String[] in = {"text.txt", "picture.jpg", "Screenshot_4.png"};
        String start = path + "archive.zip";
        String out = path + "result/";
        try {
            // архивация
//            FileOutputStream outputStream = new FileOutputStream(out);
//            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
//            writeFileToZip(new File(start), zipOut, "");
//            System.out.println("Архивация папки завершена!");
//            zipOut.flush();
//            zipOut.close();
//            outputStream.close();

            // разархивация
            FileInputStream inputStream = new FileInputStream(start);
            ZipInputStream zipInput = new ZipInputStream(inputStream);
            while (true) {
                ZipEntry entry = zipInput.getNextEntry();
                if (entry == null) {
                    break;
                }
                File file = new File(out + entry.getName());
                if (entry.isDirectory()) {
                    //noinspection ResultOfMethodCallIgnored
                    file.mkdirs();
                } else {
                    byte[] bytes = zipInput.readAllBytes();
                    Files.write(Paths.get(file.getAbsolutePath()), bytes, StandardOpenOption.CREATE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    // метод для архивации файлов
    public static void archivingFiles(String path, String[] in) {
//            for (String fileName : in) {
//                File file = new File(path + fileName);
//                ZipEntry entry = new ZipEntry(file.getName());
//                zipOut.putNextEntry(entry);
//                Path filePath = Paths.get(file.getAbsolutePath());
//                byte[] data = Files.readAllBytes(filePath);
//                zipOut.write(data);
//            }
        //            System.out.println("Архивация успешно завершена!");
    }

    public static void writeFileToZip(File file, ZipOutputStream zipOut, String path) throws Exception {
        if (file.isDirectory()) {
            String folder = path + file.getName() + "/";
            ZipEntry entry = new ZipEntry(folder);
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            File[] files = file.listFiles();
            assert files != null;
            for (File subFile : files) {
                writeFileToZip(subFile, zipOut, folder);
            }
            return;
        }
        ZipEntry entry = new ZipEntry(path + file.getName());
        zipOut.putNextEntry(entry);
        Path filePath = Paths.get(file.getAbsolutePath());
        byte[] bytes = Files.readAllBytes(filePath);
        zipOut.write(bytes);
    }
}
