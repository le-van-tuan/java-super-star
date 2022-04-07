package vn.sps.oops.encapsulation;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ApplicationTesting {

    public static void main(String[] args) {
        try {
            File file = File.createTempFile("test", "a.zip");
            FileUtils.copyURLToFile(new URL("https://gomob.tts.evolus.vn/team/hsshs/controller/migration-log/f86TmOTzbrzymwysvTqvlieDs8f6IWFT111"), file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
