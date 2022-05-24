// Utilizando como base sua resolução ao Exercício 5 (Empresa com 10 funcionários), ou o criado em aula e disponibilizado em Gist - Exercício 5, (Links para um site externo.) adapte a solução aplicando os conceitos de OO aprendidos até agora.
// Sugestão: Criar classes Funcionario e Holerite

package ex5COMPANY;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // var declaration
    int i = 1;
    Funcionario funcionario1 = new Funcionario();
    Holerite holerite1 = new Holerite();

    // Greeting
    System.out.println("Bem-vinda(o) ao sistema da empresa X :)");

    // loop start
    while (i < 11) {

      System.out.println("Digite as informações do funcionário " + i);
      funcionario1.AddNewWorker();

      holerite1.CalculateInitialSalary(funcionario1);
      holerite1.ShowInitialSalary(funcionario1);
      holerite1.CalculateFinalSalary(funcionario1);
      holerite1.ShowFinalSalary(funcionario1);

      // increment counter
      i++;
    }

    System.out.println(funcionario1);
    System.out.println("Obrigado por usar o programa!");
    input.close();
  }
}