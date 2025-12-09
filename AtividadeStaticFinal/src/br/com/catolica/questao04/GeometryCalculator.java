package br.com.catolica.questao04;

public final class GeometryCalculator {
    public static final double PI = 3.14159;

    private GeometryCalculator() {}

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double circlePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}