package hw1;

import java.io.File;
import java.util.concurrent.ForkJoinPool;


public class Main {
    public static void main(String[] args) {

        String dok = "F:\\Programs\\steam";
        File file = new File(dok);
        long start = System.currentTimeMillis();
        FileEdit fileEdit = new FileEdit(file);
        ForkJoinPool pool = new ForkJoinPool();
        long size = pool.invoke(fileEdit);
        System.out.println(getHumanReadableSize(size));
        System.out.println(size);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration + " ms");
    }

    public static String getHumanReadableSize(long size) {
        double B = (double) size;
        double Kb = B / 1024;
        double Mb = Kb / 1024L;
        double Gb = Mb / 1024L;

        String okrKb = String.format("%.1f", Kb);
        String okrMb = String.format("%.1f", Mb);
        String okrGb = String.format("%.1f", Gb);

        return "Размер папки в байтах: " + size + " B\n" +
                "Размер папки килобайтах: " + okrKb + " Kb\n" +
                "Размер папки мегабайтах: " + okrMb + " Mb\n" +
                "Размер папки гигабайтах: " + okrGb + " Gb\n";
    }

//    public static long getFolderSize(File folder) {
//        if (folder.isFile()) {
//            return folder.length();
//        }
//        long B = 0L;
//        long Kb;
//        long Mb;
//        long Gb;
//
//        double s = 11290199554L;
//        double x = s / 1024 / 1024 / 1024;
//        String res = String.format("%.1f", x);
//        File[] files = folder.listFiles();
//        assert files != null;
//        for (File file : files) {
//            B += getFolderSize(file);
//        }
//        Kb = B / 1024L;
//        Mb = Kb / 1024L;
//        Gb = Mb / 1024L;
//        System.out.println("Размер папки в байтах: " + B + " B\n" +
//                "Размер папки килобайтах: " + Kb + " Kb\n" +
//                "Размер папки мегабайтах: " + Mb + " Mb\n" +
//                "Размер папки гигабайтах: " + Gb + " Gb\n");
//        return B;
//    }

}


