package ex8INTERFACE;

public class Square implements Geometric {
  private double area;
  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public void area() {
    this.area = this.side * this.side;
    System.out.println("The area of the square is: " + area);
  }
}
