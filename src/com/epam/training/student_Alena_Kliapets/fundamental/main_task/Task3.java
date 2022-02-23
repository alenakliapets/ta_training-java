package com.epam.training.student_Alena_Kliapets.fundamental.main_task;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main (String [] args){
        System.out.print("Введите количество случайых чисел ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int quantity = scanner.nextInt();
        int [] array = new int[quantity];
        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.print("Случайные числа от 0 до 100 без перехода на новую строку: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\nСлучайные числа от 0 до 100 с переходом на новую строку: ");
        for (int j : array) {
            System.out.println(j);
        }
        }
    }

