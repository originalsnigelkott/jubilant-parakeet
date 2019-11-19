package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtils {
    public static void saveText(String filename, List<String> list, StandardOpenOption... option) {
        Path path = Paths.get(filename);
        try {
            Files.write(path, list, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> loadText(String filename) {
        Path path = Paths.get(filename);
        try {
            return Files.readAllLines(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
