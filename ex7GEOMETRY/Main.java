// Com o uso de herança e polimorfismo, crie um programa que calcule a área de uma figura geométrica. 
// Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo.

package ex7GEOMETRY;

public class Main {
  public static void main(String[] args) {

    Geometric triangle = new Triangle(2, 2);
    Geometric square = new Square(2);
    Geometric rectangle = new Rectangle(2, 3);
    Geometric circle = new Circle(2);

    triangle.area();
    square.area();
    rectangle.area();
    circle.area();

  }
}
