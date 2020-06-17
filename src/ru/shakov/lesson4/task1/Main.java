package ru.shakov.lesson4.task1;

import java.util.Scanner;

// Нахождение меньшего из двух чисел

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = sc.nextInt();
        if (firstNumber >= secondNumber) {
            System.out.printf("Меньшее из двух введенных чисел равно %d\n", secondNumber);
        } else {
            System.out.printf("Меньшее из двух введенных чисел равно %d\n", firstNumber);
        }

    }
}
