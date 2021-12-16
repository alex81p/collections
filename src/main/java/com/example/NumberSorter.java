package com.example;


// 5. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец,
// а положительные — в начало списка.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class NumberSorter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(2000)-1000);
        }
        System.out.println("Initial list: " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Processed list: " + list);
    }
}
