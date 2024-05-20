import java.util.Scanner;

public class Uni5Exe08 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int negativoMenor = 0;
    double positivoMedia = 0;
    double positivoSoma = 0;
    int positivoQtd = 0;

    System.out.print("Qual é a quantidade de números a ser lida? ");
    int qtdNumeros = teclado.nextInt();

    int numeroLido;
    for (int cont = 1; cont <= qtdNumeros; cont++) {
      System.out.print("Digite um número inteiro: ");
      numeroLido = teclado.nextInt();
      if (numeroLido < 0) {
        if (numeroLido < negativoMenor) {
          negativoMenor = numeroLido;
        }
      }
      if (numeroLido > 0) {
        positivoSoma += numeroLido;
        positivoQtd += 1;
      }
    }

    if (negativoMenor == 0) {
      System.out.println("Não foi digitado um valor negativo");
    } else {
      System.out.println("O menor valor negativo é: " + negativoMenor);
    }
    if (positivoQtd > 0) {
      positivoMedia = positivoSoma / positivoQtd;
      System.out.println("A média dos números positivos é: " + positivoMedia);
    } else {
      System.out.println("Não foi digitado um valor positivo");
    }

    teclado.close();
  }

}