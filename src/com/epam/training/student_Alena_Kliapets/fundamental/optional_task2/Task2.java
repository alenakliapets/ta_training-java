package com.epam.training.student_Alena_Kliapets.fundamental.optional_task2;

import java.util.Scanner;

public class Task2 {
    //Ввести с консоли n - размерность матрицы a [n] [n].
    //Задать значения элементов матрицы в интервале значений от -M до M
    //с помощью генератора случайных чисел (класс Random).
    //Найти и вывести наибольшее число возрастающих элементов матрицы, идущих подряд.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы ");
        int number = scanner.nextInt();
        System.out.println("Введите интервал значений М для генератора случайных чисел");
        int m = scanner.nextInt();
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = (int) (Math.random() * 2 * m - m);
            }
        }
        int max = 0;
        for (int i = 0; i < number; i++) {
            int quantityOfIncreasingNumbers = 1;
            for (int j = 0; j < number-1; j++) {
                if (array[i][j]<array[i][j+1]) {
                    quantityOfIncreasingNumbers++;
                    System.out.println(array[i][j]+ "<"+array[i][j+1]);
                    if (quantityOfIncreasingNumbers>max) max = quantityOfIncreasingNumbers;
                }
                else quantityOfIncreasingNumbers = 1;
            }
        }
        System.out.println("Наибольшее число возрастающих элементов матрицы, идущих подряд равно: " + max);
    }
}