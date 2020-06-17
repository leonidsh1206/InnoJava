package ru.shakov.lesson4.task3;

// Вывод на экран таблицы умножения

public class Main {
    public static void main(String[] args) {
        int i, j;
        int n = 9;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                int result = i * j;
                System.out.printf("%d * %d = %d\t", j, i, result);
            }
            System.out.println();
        }
    }
}
