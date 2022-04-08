package vn.sps.oops.abstraction;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL location = Application.class.getClassLoader().getResource("ReferrenceData.txt");
        Path path = Paths.get(location.toURI());
        BaseFileReader baseFileReader = new LowerCaseFileReader(path);
        for (String s : baseFileReader.readFile()) {
            System.out.println(s);
        }
    }
}
