package pessoa;

public class Professor extends Pessoa {

  private String departamento;
  private String[] disciplinas;

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public void setDisciplinas(String[] disciplinas) {
    this.disciplinas = disciplinas;
  }

  public String getDepartamento() {
    return departamento;
  }

  public String[] getDisciplinas() {
    return disciplinas;
  }

  String impriimString() {
    return "Voce é professor";
  }
}
