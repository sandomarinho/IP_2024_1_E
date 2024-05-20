import java.util.Scanner;

public class Uni5Exe12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qtd linhas: ");
    int qtdLinhas = teclado.nextInt();
    int numFloyd;

    // Opção A: sem consistir os espaçamentos
    numFloyd = 1;
    for (int linha = 1; linha <= qtdLinhas; linha++) {
      for (int coluna = 1; coluna <= linha; coluna++) {
        System.out.print(numFloyd + " ");
        numFloyd++;
      }
      System.out.println();
    }

    // Opção B: consistindo os espacamentos até 3 digitos
    numFloyd = 1;
    for (int linha = 1; linha <= qtdLinhas; linha++) {
      for (int coluna = 1; coluna <= linha; coluna++) {
        if (numFloyd < 10) {
          System.out.print(numFloyd + " ");
        } else {
          if (numFloyd < 100) {
            System.out.print(numFloyd + " ");
          } else {
            System.out.print(numFloyd + " ");
          }
        }
        numFloyd++;
      }
      System.out.println();
    }

    // Opção C: consistindo os espacamentos não importando a qtd. de digitos
    // Opção C1: achar o valor de numFloyd considerando qtdLinhas
    int numFloydMax = 1;
    int numFloydInc = 2;
    for (int i = 1; i <= qtdLinhas; i++) {
      numFloydMax += numFloydInc;
      numFloydInc++;
    }

    numFloyd = 1;
    for (int linha = 1; linha <= qtdLinhas; linha++) {
      for (int coluna = 1; coluna <= linha; coluna++) {
        numFloyd++;
      }
    }
    if (numFloydMax != numFloyd) {
      System.out.println(" ... erro ... deveria ser igual!");
    }

    String espacos = "   ";
    int numBase = 10;
    numFloyd = 1;
    for (int linha = 1; linha <= qtdLinhas; linha++) {
      for (int coluna = 1; coluna <= linha; coluna++) {
        if (numFloyd >= numBase) {
          espacos = espacos.substring(1);
          numBase *= 10;
        }
        System.out.print(numFloyd + espacos);
        numFloyd++;
      }
      System.out.println();
    }

    teclado.close();
  }
}
