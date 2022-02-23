package com.epam.training.student_Alena_Kliapets.fundamental.optional_task1;

import java.util.Scanner;

public class Task1 {
//Ввести n чисел с консоли.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, считываемых с консоли ");
        int number = scanner.nextInt();
        String [] arrayOfNumbers = new String[number];
        System.out.println("Введите числа ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.next();
        }
        String maxLengthNumber = "";
        String minLengthNumber = "";
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() > maxLength) {
                maxLength = arrayOfNumber.length();
                maxLengthNumber = arrayOfNumber;
            }
            if (arrayOfNumber.length() < minLength) {
                minLength = arrayOfNumber.length();
                minLengthNumber = arrayOfNumber;
            }
        }
        System.out.println("Самое короткое число: " + minLengthNumber + ". Его длина составляет: " + minLength);
        System.out.println("Самое длинное число: " + maxLengthNumber + ". Его длина составляет: " + maxLength);
    }
}
