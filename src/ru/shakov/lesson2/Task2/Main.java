package ru.shakov.lesson2.Task2;

// Программа для расчета зарплаты на руки

public class Main {
    public static void main(String[] args) {
        double part = Double.parseDouble(args[0]); // ставка после вычетания налога

        double value = Double.parseDouble(args[1]);
        double cost = part * value; // Зарплаты на руки
        System.out.printf("После вычетания налога с суммы %.2f руб. зарплата составит %.2f руб.", value, cost);
    }
}