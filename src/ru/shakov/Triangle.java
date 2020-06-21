package ru.shakov;

public class Triangle {
  // state of a triangle
  // sides
  private double sideA;
  private double sideB;
  private double sideC;
  // angles
  private double angleA;
  private double angleB;
  private Angle angleC;

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public Triangle(double sideA, double sideB, Angle angleC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.angleC = angleC;
  }

  public double getSideA() {
    return sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public double getSideC() {
    return sideC;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "sideA=" + sideA +
            ", sideB=" + sideB +
            ", sideC=" + sideC +
            ", angleA=" + angleA +
            ", angleB=" + angleB +
            ", angleC=" + angleC +
            '}';
  }
}
