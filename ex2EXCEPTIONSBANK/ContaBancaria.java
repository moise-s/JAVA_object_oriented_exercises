package ex2EXCEPTIONSBANK;

public class ContaBancaria {
  private double saldo; // Determina o saldo da conta.
  private double limite; // Determina o limite de crédito do cheque especial.

  @Override
  public String toString() {
    return "ContaBancaria [limite=" + limite + ", saldo=" + saldo + "]";
  }

  // Construtor padrão da classe.
  public ContaBancaria(double valorSaldo, double valorLimite) {
    this.saldo = valorSaldo;
    this.limite = valorLimite;
  }

  // Retorna o saldo da conta.
  public double getSaldo() {
    return saldo;
  }

  // Retorna o limite da conta.
  protected double getLimite() {
    return limite;
  }

  // Retorna o saldo da conta somado ao limite.
  public double getSaldoComLimite() {
    return this.saldo + this.limite;
  }

  // Deve decrementar o valor do saque da Conta. Retorna "true" caso a operação
  // tenha sido bem sucedida, ou seja, a conta possui este valor (lembre-se de
  // considerar o limite).
  public boolean sacar(double valor) throws ContaException {
    if (valor < 500 && valor <= (this.saldo + this.limite)) {
      if (valor < this.saldo) {
        this.saldo -= valor;
      } else {
        this.limite = this.limite + this.saldo - valor;
        this.saldo = 0;
      }
      return true;
    } else if (valor >= 500) {
      throw new ContaException("ERRO: valor de saque muito alto");
    } else {
      throw new ContaException("ERRO: saldo não suficiente para a operação");
    }
  }

  // Deve incrementar o valor a Conta.
  public void depositar(double valor) throws ContaException {
    if (valor > 1000) {
      throw new ContaException("ERRO: não é possível depositar mais de R$1000.");
    } else {
      this.saldo += valor;
    }
  }

}
