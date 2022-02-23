package com.epam.training.student_Alena_Kliapets.fundamental.main_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    //Ввести целые числа как аргументы командной строки,
    //подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Введите первое целое число ");
        int first = scanner.nextInt();
        System.out.println("Введите второе целое число ");
        int second = scanner.nextInt();
        int sum = first + second;
        int multiplication = first * second;
        System.out.println("Сумма введенных чисел равна "+ sum);
        System.out.println("Произведение введенных чисел равно "+ multiplication);}
        catch (InputMismatchException e){
            System.out.println("Ошибка, введены неверные данные");
        }
    }
}
