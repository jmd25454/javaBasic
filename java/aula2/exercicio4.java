package aula2;
import java.util.Scanner;

public class exercicio4 {

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

    double notaFinal = (nota1 * 0.05) + (nota2 * 0.05) + (nota3 * 0.2) + (nota4 * 0.2) + (nota5 * 0.5);


    if( notaFinal >= 6){
      System.out.printf("\nNome: %s\nMatricula: %s\nNota Final: %.1f\nAprovado: SIM (X) NAO ( )", nome, mat, notaFinal);
    } 
    else{
      System.out.printf("\nNome: %s\nMatricula: %s\nNota Final: %.1f\nAprovado: SIM ( ) NAO (X)", nome, mat, notaFinal);
    }

    System.out.println("\n");
  
    System.out.println("O sistema terminou!! Obrigado por usar nosso app.");

    System.out.println("\n");

  scan.close();

  }
}
