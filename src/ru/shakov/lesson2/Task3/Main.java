package ru.shakov.lesson2.Task3;

// Программа для перерасчета секунд в часы

public class Main {
    public static void main(String[] args) {
        double seconds = Double.parseDouble(args[0]);
        double hours = seconds / 3600.0; // Количество часов
        System.out.printf("В %f секундах содержится %f часов", seconds, hours);
    }
}