package aula3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

  public static void main(String[] args) throws FileNotFoundException{

    File arquivo = new File("C");

    Scanner scan = new Scanner(arquivo);
    
    while (scan.hasNext()) {
      System.out.println(scan.nextLine());
    }
    scan.close();


    
  }

  
}
