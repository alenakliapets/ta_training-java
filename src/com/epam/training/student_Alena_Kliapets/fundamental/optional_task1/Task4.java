package com.epam.training.student_Alena_Kliapets.fundamental.optional_task1;

import java.util.Scanner;

public class Task4 {
    //Ввести n чисел с консоли.
    //Найти количество чисел, содержащих только четные цифры,
    //а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, считываемых с консоли ");
        int number = scanner.nextInt();
        String[] arrayOfNumbers = new String[number];
        System.out.println("Введите числа ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.next();
        }
        int completelyOutOfEvenNumbers = 0;
        int equalNumberOfEvenAndOdd = 0;
        for (String arrayOfNumber : arrayOfNumbers) {
            int quantityOfEvenNumbers = 0;
            int quantityOfOddNumbers = 0;
            for (int j = 0; j < arrayOfNumber.length(); j++) {
                if (arrayOfNumber.charAt(j) % 2 == 0)
                    quantityOfEvenNumbers++;
                else quantityOfOddNumbers++;
            }
            if (quantityOfEvenNumbers == arrayOfNumber.length())
                completelyOutOfEvenNumbers++;
            if (quantityOfEvenNumbers == quantityOfOddNumbers)
                equalNumberOfEvenAndOdd++;
        }
        System.out.println("Количество чисел, содержащих только четные цифры равно: " + completelyOutOfEvenNumbers);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр равно: " + equalNumberOfEvenAndOdd);

    }
}
