package vn.sps.oops.abstraction;

import java.nio.file.Path;

public class LowerCaseFileReader extends BaseFileReader {

    public LowerCaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toLowerCase();
    }
}
