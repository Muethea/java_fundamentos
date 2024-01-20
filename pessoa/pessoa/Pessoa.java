package pessoa;

public class Pessoa {

  private String nome;
  private int idade;
  private Character genero;
  private String address;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setGenero(Character genero) {
    this.genero = genero;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public Character getGenero() {
    return genero;
  }

  public String getAddress() {
    return address;
  }

  String impriimString() {
    return "O nome da pessoa é " + nome + " a idade é " + idade;
  }
}
