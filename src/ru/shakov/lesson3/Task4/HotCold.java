package ru.shakov.lesson3.Task4;

import java.util.Scanner;

// реализация игры горячо-холодно

public class HotCold {
    public static void main(String[] args) {
        double num = Math.random();         // генерация случайного числа [0,1)
        num = num * 100 + 1;                 // генерация случайного числа [1,101)
        int randomNumber = (int) num;       // приведение к типу int, отбрасывание дробной части
        // случайное целое число в диапазоне [1,100]
        int lastNumber = 0;                 //считаем, что первое введенное число равно 0
        int nextNumber;
        //System.out.println(randomNumber);


        for (int i = 1; i <= 10; i++) {
            System.out.printf("Введите целое число от 1 до 100. Осталось %d попыток\n", 11 - i);
            Scanner sc = new Scanner(System.in);
            nextNumber = sc.nextInt();

            if (nextNumber == randomNumber) {
                System.out.printf("Поздравляем, вы угадали число %d", randomNumber);
                break;
            } else {
                int a = Math.abs(randomNumber - lastNumber);
                int b = Math.abs(randomNumber - nextNumber);
                if (a < b) {
                    System.out.println("Холодно");
                } else {
                    System.out.println("Горячо");
                }
            }
            lastNumber = nextNumber;
            if (i == 10) {
                System.out.println("Попытки закончились");
            }
        }
    }
}
