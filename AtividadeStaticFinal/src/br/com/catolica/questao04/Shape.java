package br.com.catolica.questao04;

public abstract class Shape {
    protected final String name;
    protected final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public final String getDescription() {
        return name + " (" + color + ")";
    }
}