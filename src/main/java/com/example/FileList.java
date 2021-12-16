package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// 3. Создать список из элементов каталога и его подкаталогов.

public class FileList {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        try {
            Files.walk(Paths.get(""))
                    .skip(1)
                    .map(Path::toFile)
                    .forEach(files::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        files.forEach(System.out::println);
    }
}
