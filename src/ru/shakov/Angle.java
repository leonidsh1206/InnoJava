package ru.shakov;

public class Angle {
    private int degrees;
    private int minutes;
    private double seconds;
    private double angleInDecimalDegrees;

    public Angle(int degrees, int minutes, double seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
        this.angleInDecimalDegrees = degrees + (double) minutes / 60 + seconds / 3600;
    }

    public Angle(double angle) {
        this.angleInDecimalDegrees = angle;
        this.degrees = (int) angle;
        double minutesAndSeconds = (angle - this.degrees) * 60;
        this.minutes = (int) minutesAndSeconds;
        this.seconds = (minutesAndSeconds - this.minutes) * 60;
    }

    @Override
    public String toString() {
        return String.format("decimal: %f%nangle: %d %d %f%n", angleInDecimalDegrees, degrees, minutes, seconds);
    }
}
