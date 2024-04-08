import java.util.Scanner;

public class Uni4Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o número 1:");
    int numero1 = teclado.nextInt();
    System.out.println("Digite o número 2:");
    int numero2 = teclado.nextInt();
    if (numero1 > numero2) {
      System.out.println("O maior número é: " + numero1);
    } else {
      System.out.println("O maior número é: " + numero2);
    }
    teclado.close();
  }
}
