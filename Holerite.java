import java.util.Scanner;

public class Holerite {

  public static final double minWage = 450;
  private double hourValue;
  private double initSalary;
  private double mealTicket;
  private double finalSalary;

  public void CalculateInitialSalary(Funcionario funcionario) {

    if (funcionario.getCategory().equals("G")) {
      if (funcionario.getShift().equals("N")) {
        this.hourValue = minWage * 0.18;
      } else {
        this.hourValue = minWage * 0.15;
      }
    }
    if (funcionario.getCategory().equals("O")) {
      if (funcionario.getShift().equals("N")) {
        this.hourValue = minWage * 0.13;
      } else {
        this.hourValue = minWage * 0.10;
      }
    }

    this.initSalary = this.hourValue * funcionario.getWorkedHours();
  }

  public void ShowInitialSalary(Funcionario funcionario) {
    System.out.println("Valor da hora trabalhada: R$ " + this.hourValue);
    System.out.println("Salário inicial: R$ " + this.initSalary);
  }

  public void CalculateFinalSalary(Funcionario funcionario) {
    if (this.initSalary > 600) {
      this.mealTicket = this.initSalary * 0.05;
    } else if (this.initSalary > 300) {
      this.mealTicket = this.initSalary * 0.15;
    } else {
      this.mealTicket = this.initSalary * 0.2;
    }

    this.finalSalary = this.initSalary + this.mealTicket;
  }

  public void ShowFinalSalary(Funcionario funcionario) {
    System.out.println("Auxílio alimentação: R$ " + this.mealTicket);
    System.out.println("Salário final: R$ " + this.finalSalary);
    System.out.println("");
  }

}
