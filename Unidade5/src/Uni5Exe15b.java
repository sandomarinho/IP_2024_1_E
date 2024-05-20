import java.util.Scanner;

public class Uni5Exe15b {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome;
    double nota1, nota2, media;

    System.out.print(" nome: "); nome = teclado.next();
    while (!nome.equals("fim")) {
      System.out.print(" nota1: "); nota1 = teclado.nextDouble();
      System.out.print(" nota2: "); nota2 = teclado.nextDouble();
      media = (nota1 + nota2) / 2;
      System.out.println(" Média: " + media);

      System.out.print(" nome: "); nome = teclado.next();
    }

    teclado.close();
  }
}

