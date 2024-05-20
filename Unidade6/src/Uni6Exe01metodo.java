import java.util.Scanner;

public class Uni6Exe01metodo {

  private Uni6Exe01metodo() {
    Scanner teclado = new Scanner(System.in);
    int vetor[] = new int[10];

    // Método: Ler
    vetorLer(teclado, vetor);

    // Método: Escrever
    vetorImprimirOrdemInversa(vetor);
    teclado.close();
  }

  // Ler vetor
  private void vetorLer(Scanner teclado, int vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
      vetor[i] = teclado.nextInt();
    }
  }

  // Escrever vetor
  private void vetorImprimirOrdemInversa(int vetor[]) {
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe01metodo();
  }

}
