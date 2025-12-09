package br.com.catolica.questao04;

public class TestGeometry {
    public static void main(String[] args) {
        System.out.println("Área círculo r=5: " + GeometryCalculator.circleArea(5));
        System.out.println("É triângulo válido? " + GeometryCalculator.isValidTriangle(3, 4, 5));

        Circle circle = new Circle("Círculo1", "Vermelho", 5.0);
        Rectangle rectangle = new Rectangle("Retângulo1", "Azul", 4.0, 6.0);

        System.out.println(circle.getDescription());
        System.out.println("Área: " + circle.calculateArea());

        System.out.println(rectangle.getDescription());
        System.out.println("Área: " + rectangle.calculateArea());
    }
}