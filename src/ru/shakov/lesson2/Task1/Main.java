package ru.shakov.lesson2.Task1;

// Программа для расчета стоимости бензина

public class Main {
    public static void main(String[] args) {
        final int gasPrice = Integer.parseInt(args[0]); // Стоимость одного литра бензина

        int value = Integer.parseInt(args[1]);
        int cost = gasPrice * value; // Итоговая стоимость
        System.out.printf("Стоимость %d литра(литров) бензина составляет %d рублей.", value, cost);
    }
}
