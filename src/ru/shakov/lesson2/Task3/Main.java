package ru.shakov.lesson2.Task3;

// Программа для перерасчета секунд в часы

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд для пересчета: ");
        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextDouble();
        double hours = seconds / 3600.0; // Количество часов
        System.out.printf("%.0f секунд - это то же самое, что и %.2f часов", seconds, hours);
    }
}