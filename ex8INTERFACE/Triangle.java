package ex8INTERFACE;

public class Triangle implements Geometric {
  private double area;
  private double base;
  private double height;

  public Triangle(int base, int height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public void area() {
    this.area = this.base * this.height / 2;
    System.out.println("The area of the triangle is: " + area);
  }

}
