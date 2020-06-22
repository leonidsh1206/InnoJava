package myTests;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество членов прогрессии:");
        int number = sc.nextInt();
        System.out.println("Введите 1й член геометрической прогрессии");
        double b1 = sc.nextDouble();
        System.out.println("Введите знаменатель геометрической прогрессии");
        double q = sc.nextDouble();
        System.out.printf("b1 = %f  ", b1);
        for (int i = 2; i <= number; i++) {
            double k = i - 1;
            double bn = b1 * Math.pow(q, k);
            System.out.printf("%f  ", bn);
        }
        ;
    }
}
