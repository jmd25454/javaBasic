package aula2;
import java.util.Scanner;

public class exercicio2 {

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  int n = 0;

  while(n < 5){

    System.out.println("\n");

    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();

    System.out.println("Digite sua matrícula: ");
    String mat = scan.nextLine();

    System.out.println("Digite a nota 1: ");
    double nota1 = scan.nextInt();

    System.out.println("Digite a nota 2: ");
    double nota2 = scan.nextInt();

    double notaFinal = (nota1 + nota2) / 2;

    if((nota1 + nota2)/2 >= 6)
      System.out.printf("\nNome: %s\nMatricula: %s\nAprovado (x)Sim ( )Nao\nNota Final: %.1f", nome, mat, notaFinal);
     else if((nota1 + nota2)/2 < 6)
      System.out.printf("\nNome: %s\nMatricula: %s\nAprovado ( )Sim (x)Nao\nNota Final: %.1f", nome, mat, notaFinal);
    n++;

    System.out.println("\n");
  }

  System.out.println("O sistema terminou!! Obrigado por usar nosso app.");

  scan.close();

  }
}
