package ru.shakov.lesson2.Task1;

// Программа для расчета стоимости бензина

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int gasPrice = 43; // Стоимость одного литра бензина

        System.out.println("Введите количество литров:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        //int value = Integer.parseInt(args[1]);
        int cost = gasPrice * value; // Итоговая стоимость
        System.out.printf("Стоимость %d л. бензина составляет %d рублей.", value, cost);
    }
}
