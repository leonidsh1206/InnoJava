package Tasks.lesson2.Task3;

// Программа для перерасчета секунд в часы

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд для пересчета: ");
        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextInt();
        double hours = seconds / 3600; // Количество часов
        System.out.println(seconds + " секунд - это то же самое, что и " + hours + " часов");
    }
}