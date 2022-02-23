package com.epam.training.student_Alena_Kliapets.fundamental.optional_task1;

import java.util.Scanner;

public class Task3 {
    //Ввести n чисел с консоли.
    //Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, считываемых с консоли ");
        int number = scanner.nextInt();
        String[] arrayOfNumbers = new String[number];
        System.out.println("Введите числа ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.next();
        }
        int sum = 0;
        int average;
        for (String arrayOfNumber : arrayOfNumbers) {
            sum += arrayOfNumber.length();
        }
        average = sum/number;
        System.out.println("Средняя длина по всем числам равна " + average);
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() < average) {
                System.out.println("Число: " + arrayOfNumber + " Его длина: " + arrayOfNumber.length());
            }
        }
    }
}
