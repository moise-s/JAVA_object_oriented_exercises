package ex7GEOMETRY;

public class Square extends Geometric {
  private double area;
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public void area() {
    this.area = this.side * this.side;
    System.out.println("The area of the square is: " + area);
  }
}
