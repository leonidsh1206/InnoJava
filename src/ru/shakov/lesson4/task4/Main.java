package ru.shakov.lesson4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите 1 для вывода арифметической прогрессии, 2 для вывода геометрической прогрессии");
        int code = sc.nextInt();
        switch (code) {
            case 1:
                System.out.println("Введите количество членов прогрессии:");
                int number = sc.nextInt();
                System.out.println("Введите 1й член арифметической прогрессии:");
                int a1 = sc.nextInt();
                System.out.println("Введите разность арифметической прогрессии:");
                int d = sc.nextInt();
                System.out.printf("a1 = %d  ", a1);
                for (int i = 2; i <= number; i++) {
                    int an = a1 + (i - 1) * d;
                    System.out.printf("a%d = %d  ", i, an);
                }
                ;
                break;
            case 2:
                System.out.println("Введите количество членов прогрессии:");
                int num = sc.nextInt();
                System.out.println("Введите 1й член геометрической прогрессии");
                double b1 = sc.nextDouble();
                System.out.println("Введите знаменатель геометрической прогрессии");
                double q = sc.nextDouble();
                System.out.printf("b1 = %.0f  ", b1);
                for (int i = 2; i <= num; i++) {
                    double k = i - 1;
                    double bn = b1 * Math.pow(q, k);
                    System.out.printf("b%d = %.0f  ", i, bn);
                }
                ;
                break;
            default:
                System.out.println("Неправильно выбран тип прогрессии");
        }
    }
}