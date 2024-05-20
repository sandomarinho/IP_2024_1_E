/*
 calcula a media de duas notas até a nota 1 ser igual 99;
 */
import java.util.Scanner;

public class CaixaAreia {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota1, nota2, media;
    
    
    System.out.print("nota1:  "); nota1 = teclado.nextInt();
    while (nota1 != 99) {
      System.out.print("nota2:  "); nota2 = teclado.nextInt();
      media = (nota1 + nota2) / 2;
      System.out.println("média: " + media);      
      System.out.print("nota1:  "); nota1 = teclado.nextInt();
    }

    nota1 = 0;
    while (nota1 != 99) {
      System.out.print("nota1:  "); nota1 = teclado.nextInt();
      if (nota1 != 99) {
        System.out.print("nota2:  "); nota2 = teclado.nextInt();
        media = (nota1 + nota2) / 2;
        System.out.println("média: " + media);              
      }
    }

    do {
      System.out.print("nota1:  "); nota1 = teclado.nextInt();
      if (nota1 != 99) {
        System.out.print("nota2:  "); nota2 = teclado.nextInt();
        media = (nota1 + nota2) / 2;
        System.out.println("média: " + media);              
      }
    } while (nota1 != 99);

    teclado.close();
  }
}

