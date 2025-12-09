package br.com.catolica.questao04;

public class Circle extends Shape {
    private final double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return GeometryCalculator.circleArea(radius);
    }

    @Override
    public double calculatePerimeter() {
        return GeometryCalculator.circlePerimeter(radius);
    }
}