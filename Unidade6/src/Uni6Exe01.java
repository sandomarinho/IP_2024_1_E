import java.util.Scanner;

public class Uni6Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int vetor[] = new int[10];

    // Ler vetor
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
      vetor[i] = teclado.nextInt();
    }

    // Escrever vetor
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }

    teclado.close();
  }

}
