package ex5COMPANY;
import java.util.Scanner;

public class Funcionario {

  private int code;
  private double workedHours;
  private String shift;
  private String category;
  private Scanner input = new Scanner(System.in);

  public double getWorkedHours() {
    return workedHours;
  }

  public String getShift() {
    return shift;
  }

  public String getCategory() {
    return category;
  }

  public void AddNewWorker() {

    System.out.print("Código do funcionário: ");
    this.code = input.nextInt();

    System.out.print("Horas trabalhadas no mês: ");
    this.workedHours = input.nextDouble();

    this.shift = "";
    while (!(this.shift.equals("M")) && !(this.shift.equals("V")) && !(this.shift.equals("N"))) {
      System.out.print("Turno de trabalho (apenas M matutino; V vespertino; N noturno): ");
      this.shift = input.next();
    }

    this.category = "";
    while (!(this.category.equals("O")) && !(this.category.equals("G"))) {
      System.out.print("Categoria de trabalho (apenas O operário; G gerente): ");
      this.category = input.next();
    }

  }

  public void ShowWorker() {

    System.out.println(") As informações deste funcionário são as seguintes:");
    System.out.println("Código: " + this.code);
    System.out.println("Número de horas trabalhadas: " + this.workedHours);

  }
}
