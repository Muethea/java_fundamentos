package conta;

public class TesteContaBancaria {

  public static void main(String[] args) {

    ContaBancaria bancaria = new ContaBancaria();

    bancaria.setNumero("234");
    bancaria.setTitular("Fernando dos Santos");
    bancaria.setSaldo(2123);
    bancaria.depositor(300);
    bancaria.sacar(250);
  }

}
