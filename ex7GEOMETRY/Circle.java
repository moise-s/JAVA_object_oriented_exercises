package ex7GEOMETRY;

public class Circle extends Geometric {
  private double area;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void area() {
    this.area = this.radius * this.radius * 3.1415;
    System.out.println("The area of the circle is: " + area);
  }
}
