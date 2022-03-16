package aula2;
import java.util.Scanner;

public class exercicio3 {

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();
    System.out.println("Digite sua matrícula: ");
    String mat = scan.nextLine();

    System.out.println("Digite a nota 1: ");
    double nota1 = scan.nextInt();
    if( nota1 < 0 && nota1 > 10){
      System.out.println("Sua nota deve estar entre 0 e 10!");
    }
    else;

    System.out.println("Digite a nota 2: ");
    double nota2 = scan.nextInt();
    if( nota2 < 0 || nota2 > 10){
      System.out.println("Sua nota deve estar entre 0 e 10!");
    }
    else;
    
    System.out.println("Digite a nota 3: ");
    double nota3 = scan.nextInt();
    if( nota3 < 0 || nota3 > 10){
      System.out.println("Sua nota deve estar entre 0 e 10!");
    }
    else;
    
    System.out.println("Digite a nota 4: ");
    double nota4 = scan.nextInt();
    if( nota4 < 0 || nota4 > 10){
      System.out.println("Sua nota deve estar entre 0 e 10!");
    }
    else;
    
    System.out.println("Digite a nota 5: ");
    double nota5 = scan.nextInt();
    if( nota5 < 0 || nota5 > 10){
      System.out.println("Sua nota deve estar entre 0 e 10!");
    }
    else;

    System.out.printf("\nNome: %s\nMatricula: %s\nNota1: %.1f \nNota 2: %.1f \nNota 3: %.1f \nNota 4: %.1f \nNota 5: %.1f ", nome, mat, nota1, nota2, nota3, nota4, nota5);
     
    System.out.println("\n");
  
    System.out.println("O sistema terminou!! Obrigado por usar nosso app.");

  scan.close();

  }
}
