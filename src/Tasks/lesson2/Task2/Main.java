package Tasks.lesson2.Task2;

// Программа для расчета зарплаты на руки

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double part = 0.87; // ставка после вычетания налога

        System.out.println("Введите зарплату до вычета налога:");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextInt();
        double cost = part * value; // Зарплаты на руки
        System.out.println("После вычета налога от суммы " + value + " руб. зарплата составит " + cost + " руб.");
    }
}