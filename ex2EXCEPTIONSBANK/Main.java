package ex2EXCEPTIONSBANK;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ContaException {

    Scanner input = new Scanner(System.in);
    int opt = 99;

    System.out.print("Saldo da sua conta: R$: ");
    double saldo = input.nextDouble();
    System.out.print("Limite da sua conta: R$: ");
    double limite = input.nextDouble();
    ContaBancaria conta = new ContaBancaria(saldo, limite);

    while (opt != 0) {

      System.out.print("Digite a operação desejada (1 SAQUE / 2 DEPÓSITO / 0 EXIT): ");
      opt = input.nextInt();

      switch (opt) {
        case 0:
          break;
        case 1:
          System.out.print("Valor do saque: R$ ");
          double valorSaque = input.nextDouble();
          conta.sacar(valorSaque);
          System.out.println(conta.toString());
          break;

        case 2:
          System.out.print("Valor do depósito: R$ ");
          double valorDeposito = input.nextDouble();
          conta.depositar(valorDeposito);
          System.out.println(conta.toString());

          break;

        default:
          System.out.println("digite uma opção válida");
          break;
      }
    }

    System.out.println("Obrigado por usar o programa!");
    input.close();
  }

}
