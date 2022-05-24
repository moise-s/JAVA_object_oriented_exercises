package ex4AGENDA;

public class Person {
  private String name;
  private int age;
  private double height;

  public Person(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + " age=" + age + ", height=" + height + "]";
  }

}
