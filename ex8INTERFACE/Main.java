// Altere a solução dada ao exercício 7. Figuras Geométricas (Herança e Polimorfismo)  para que seja utilizada implementação de Interface em vez de herança.

package ex8INTERFACE;

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
