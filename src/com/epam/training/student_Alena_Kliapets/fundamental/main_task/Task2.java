package com.epam.training.student_Alena_Kliapets.fundamental.main_task;

import java.util.Scanner;

public class Task2 {
    //Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] array = scanner.nextLine().toCharArray();
        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i]);
        }
    }
}