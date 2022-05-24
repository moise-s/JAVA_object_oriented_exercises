package ex7GEOMETRY;

public class Rectangle extends Geometric {
  private double area;
  private double side1;
  private double side2;

  public Rectangle(double side1, double side2) {
    this.side1 = side1;
    this.side2 = side2;
  }

  public void area() {
    this.area = this.side1 * this.side2;
    System.out.println("The area of the rectangle is: " + area);
  }
}
