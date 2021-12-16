package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

public class StringSorter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Pushkin.txt"));
        List<String> list = bufferedReader.lines().collect(Collectors.toList());
        bufferedReader.close();
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
