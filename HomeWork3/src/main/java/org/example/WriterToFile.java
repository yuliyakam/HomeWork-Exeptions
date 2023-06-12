package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile {

    public void writeToFile(String str, String path) {
        File file = new File(path);
        try (FileWriter fw = new FileWriter(file, true);) {
            fw.write(str);
            fw.append('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
