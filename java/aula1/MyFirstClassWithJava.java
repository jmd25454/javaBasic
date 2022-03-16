package aula1;
public class MyFirstClassWithJava {
  public static void main(String... args) {

    String nome = "Joao Vitor M Abreu";
    double nota1 = 10;
    double nota2 = 9;
    String matricula = "211555";
    double notafinal = (nota1 + nota2) / 2;

    if((nota1 + nota2)/2 >= 6)
    System.out.printf("Nome: %s\nMatricula: %s\nAprovado (x)Sim ( )Nao\nNota Final: %.1f", nome, matricula, notafinal);
    else if((nota1 + nota2)/2 < 6)
    System.out.printf("Nome: %s\nMatricula: %s\nAprovado ( )Sim (x)Nao\nNota Final: %.1f", nome, matricula, notafinal);

}

}