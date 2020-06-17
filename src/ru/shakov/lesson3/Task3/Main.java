package ru.shakov.lesson3.Task3;

// Программа для перерасчета секунд в часы

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд для пересчета: ");
        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextDouble();
        double hours = seconds / 3600.0; // Количество часов
        System.out.printf("В %f секундах содержится %f часов", seconds, hours);
    }
}