import java.util.Scanner;

public class Uni5Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numero = 0;
    for (int i = 1; i <= 20; i++) {
      System.out.print("Digite um numero [" + i + "]: ");
      numero = teclado.nextInt();
      if ((numero % 2) == 0) {
        System.out.println("é par");
      } else {
        System.out.println("é impar");
      }
    }

    teclado.close();
  }
}
