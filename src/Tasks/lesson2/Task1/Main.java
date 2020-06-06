package Tasks.lesson2.Task1;

// Программа для расчета стоимости бензина

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gasPrice = 43; // Стоимость одного литра бензина

        System.out.println("Введите количество литров:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
            int cost = gasPrice * value; // Итоговая стоимость
            System.out.println("Стоимость " + value + " л. бензина составляет " + cost + " рублей.");
    }
}
