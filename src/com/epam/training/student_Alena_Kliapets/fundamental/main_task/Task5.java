package com.epam.training.student_Alena_Kliapets.fundamental.main_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    //Ввести число от 1 до 12.
    //Вывести на консоль название месяца, соответствующего данному числу.
    //Осуществить проверку корректности ввода чисел.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        System.out.println("Введите целое число от 1 до 12");
        try{
            month = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка, введены неверные данные");
        }
        if (((month>12)||(month<1))&&(month!=0)) System.out.println("Ошибка, необходимо ввести число от 1 до 12");
        switch (month) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println("Июль");
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println("Ноябрь");
            case 12 -> System.out.println("Декабрь");
        }
    }
}
