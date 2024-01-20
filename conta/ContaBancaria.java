package conta;

public class ContaBancaria {

  private String numero;
  private String titular;
  private double saldo;

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getTitular() {
    return titular;
  }

  void depositor(double valor) {

    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("O Deposito de " + valor + ". Saldo atual " + saldo);
    } else {
      System.out.println("Digite um saldo valido");
    }
  }

  void sacar(double valor) {

    if (valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque de " + valor + ". Saldo atual " + saldo);
    } else {
      System.out.println("Nao tens dinheiro para sacar");
    }
  }
}
