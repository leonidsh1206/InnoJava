package ru.shakov.lesson3.Task1;

// Программа для расчета стоимости бензина

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int gasPrice = 43; // Стоимость одного литра бензина

        System.out.println("Введите кол-во литров:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int cost = gasPrice * value; // Итоговая стоимость
        System.out.printf("Стоимость %d литра(литров) бензина составляет %d рублей.", value, cost);
    }
}
