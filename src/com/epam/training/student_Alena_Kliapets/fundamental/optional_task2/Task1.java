package com.epam.training.student_Alena_Kliapets.fundamental.optional_task2;

import java.util.*;

public class Task1 {
    //Ввести с консоли n - размерность матрицы a [n] [n].
    //Задать значения элементов матрицы в интервале значений от -M до M
    //с помощью генератора случайных чисел (класс Random).
    //Упорядочить строки матрицы в порядке возрастания значений элементов k-го столбца.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы ");
        int number = scanner.nextInt();
        System.out.println("Введите интервал значений М для генератора случайных чисел");
        int m = scanner.nextInt();
        System.out.println("Введите номер столбца");
        int k = scanner.nextInt();
        int [][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = (int)(Math.random()*2*m - m);
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        List<int[]> matrixList = Arrays.asList(array);
        matrixList.sort(Comparator.comparingInt(o -> o[k]));
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}