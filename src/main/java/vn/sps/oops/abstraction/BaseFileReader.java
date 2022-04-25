package vn.sps.oops.abstraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFileReader implements FileService {

    protected Path filePath;

    protected BaseFileReader(Path filePath) {
        this.filePath = filePath;
    }

    public List<String> readFile() throws IOException {
        return Files.lines(filePath)
                .map(this::mapFileLine).collect(Collectors.toList());
    }

    protected abstract String mapFileLine(String line);

    public static void openFile() {
        System.out.println("File is opening...");
    }
}
