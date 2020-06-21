package ru.shakov;

import java.util.Locale;
import java.util.Scanner;

/**
 * Дано: пользователь вводит элементы треугольника (1 - три стороны, 2 - две стороны и угол между ними, 3 - одна сторона и два прилежащих к ней угла).
 * Надо: найти остальные элементы треугольника и вычислить периметр, площадь, радиусы вписанной и описанной окружностей, ...
 */
public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Введите 1, 2 или 3:");
      int code = scanner.nextInt();
      switch (code) {
        case 1: {
          double sideA = scanner.nextDouble();
          double sideB = scanner.nextDouble();
          double sideC = scanner.nextDouble();
          Triangle triangle = new Triangle(sideA, sideB, sideC);
          // calculateOtherElements(); // todo: make a realization
          System.out.printf(Locale.US, "%s", triangle);
          // apply sine theorem -> angleB, angleC
          // calculate perimeter, area, radii, ...
          break;
        }
        case 2: {
          double sideA = scanner.nextDouble();
          double sideB = scanner.nextDouble();
          double angleC = scanner.nextDouble();
          Triangle triangle = new Triangle(sideA, sideB, new Angle(angleC));
          // calculateOtherElements();
          System.out.println(triangle);
          break;
        }
      }
    }
  }

  private static double calculateAngleA(Triangle triangle) {
    double angleA = triangle.getSideB() * triangle.getSideB() / (2 * triangle.getSideB() * triangle.getSideC()) + triangle.getSideC() * triangle.getSideC() / (2 * triangle.getSideB() * triangle.getSideC()) - triangle.getSideA() * triangle.getSideA() / (2 * triangle.getSideB() * triangle.getSideC());
    triangle.setSideA(angleA);
    return angleA;
  }
}
