package pessoa;

public class Aluno extends Pessoa {

  private String matricula;
  private int[] notas;

  

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setNotas(int[] notas) {
    this.notas = notas;
  }

  public String getMatricula() {
    return matricula;
  }

  public int[] getNotas() {
    return notas;
  }

  String impriimString() {
    return "Voce é aluno";
  }
}
