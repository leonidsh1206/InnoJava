package ru.shakov.lesson3.Task2;

// Программа для расчета зарплаты на руки

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double part = 0.87; // ставка после вычетания налога

        System.out.println("Введите зарплату до вычета налога: ");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        double cost = part * value; // Зарплаты на руки
        System.out.printf("После вычетания налога с суммы %.2f руб. зарплата составит %.2f руб.", value, cost);
    }
}