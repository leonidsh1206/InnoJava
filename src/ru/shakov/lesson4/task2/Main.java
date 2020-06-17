package ru.shakov.lesson4.task2;

import java.util.Scanner;

// Описание введенного числа

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int parity = Math.abs(number % 2);
        if (number == 0) {
            System.out.println("Введено число равное 0");
        } else {
            if (number < 0) {
                System.out.print("Введено число отрицательное, ");
            } else {
                System.out.print("Введено число положительное, ");
            }
            switch (parity) {
                case 0:
                    System.out.print("четное");
                    break;
                case 1:
                    System.out.print("нечетное");
                    break;
            }
        }
    }
}
