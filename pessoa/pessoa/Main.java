package pessoa;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Aluno aluno = new Aluno();

    System.out.println("Digite o nome do Aluno");
    aluno.setNome(scanner.nextLine());
    System.out.println("Digite a idade do aluno");
    aluno.setIdade(scanner.nextInt());

    System.out.println("Digite o genero");
    aluno.setGenero(scanner.next().charAt(0));

    if (aluno.getGenero().equals('M') || aluno.getGenero().equals('F')) {

    } else {
      System.out.println("Digite um genero valido");
      aluno.setGenero(scanner.next().charAt(0));

    }

    Professor professor = new Professor();

    System.out.println("Digite o nome do professor");
    professor.setNome(scanner.nextLine());
    System.out.println("Digite a idade do professor");
    professor.setIdade(scanner.nextInt());

    System.out.println("Digite o genero");
    professor.setGenero(scanner.next().charAt(0));

    if (professor.getGenero().equals('M') || professor.getGenero().equals('F')) {

    } else {
      System.out.println("Digite um genero valido");
      professor.setGenero(scanner.next().charAt(0));

    }
    System.out.println(aluno.impriimString());
    System.out.println(professor.impriimString());
  }

}
