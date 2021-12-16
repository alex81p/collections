package com.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


// 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

public class DigitOrderReverser {
    public static void main( String[] args ) {
        Deque<Character> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        char[] digits = String.valueOf(Math.abs(number)).toCharArray();
        for (char digit:digits) {
            stack.push(digit);
        }
        StringBuilder reversedAbsoluteNumberAsString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedAbsoluteNumberAsString.append(stack.pop());
        }
        int reversedNumber = Integer.parseInt(reversedAbsoluteNumberAsString.toString());
        if (number < 0) {
            reversedNumber *= -1;
        }
        System.out.print("The number with digits put in reverse order: " + reversedNumber);
    }
}
