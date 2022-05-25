package ex8INTERFACE;

public class Circle implements Geometric {
  private double area;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void area() {
    this.area = this.radius * this.radius * 3.1415;
    System.out.println("The area of the circle is: " + area);
  }
}
