package hw1;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FileEdit extends RecursiveTask<Long> {

    private final File folder;

    public FileEdit(File folder) {
        this.folder = folder;
    }

    @Override
    protected Long compute() {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;

        List<FileEdit> subTasks = new LinkedList<>();
        File[] files = folder.listFiles();
        assert files != null;
        for (File file : files) {
            FileEdit task = new FileEdit(file);
            task.fork();
            subTasks.add(task);
        }
        for (FileEdit task : subTasks) {
            sum += task.join();
        }

        return sum;
    }


}


