package com.epam.training.student_Alena_Kliapets.fundamental.optional_task1;

import java.util.Scanner;

public class Task2 {
    //Ввести n чисел с консоли.
    //Вывести числа в порядке возрастания значений их длины.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, считываемых с консоли ");
        int number = scanner.nextInt();
        String[] arrayOfNumbers = new String[number];
        System.out.println("Введите числа ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.next();
        }
        boolean isSorted = false;
        String temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
                if (arrayOfNumbers[i].length() > arrayOfNumbers[i + 1].length()) {
                    isSorted = false;
                    temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                    arrayOfNumbers[i + 1] = temp;
                }
            }
        }
        for (String arrayOfNumber : arrayOfNumbers) {
            System.out.println(arrayOfNumber);
        }
    }
}
