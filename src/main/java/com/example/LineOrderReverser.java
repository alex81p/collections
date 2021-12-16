package com.example;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// 1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

public class LineOrderReverser {
    public static void main( String[] args ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Pushkin.txt"));
        List<String> list = bufferedReader.lines().collect(Collectors.toList());
        bufferedReader.close();
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("data/Pushkin.txt")));
        Collections.reverse(list);
        list.forEach(printWriter::println);
        printWriter.close();
    }
}
