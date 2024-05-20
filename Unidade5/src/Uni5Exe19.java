import java.util.Scanner;

public class Uni5Exe19 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double valorCampra;
    double valorComDesconto;
    double valorComDescontoSoma = 0;

    System.out.println("Informe o valor da compra: ");
    valorCampra = teclado.nextDouble();
    while (valorCampra != 0) {
      if (valorCampra > 500) {  // 20% desconto
        valorComDesconto = valorCampra - (valorCampra * 0.20);
      } else {                  // 15% desconto
        valorComDesconto = valorCampra - (valorCampra * 0.15);
      }
      System.out.println("  total a pagar: " + valorComDesconto);
      valorComDescontoSoma += valorComDesconto;

      System.out.println("Informe o valor da compra: ");
      valorCampra = teclado.nextDouble();
    }
    System.out.println(" total recebido: " + valorComDescontoSoma);
    teclado.close();
  }

}
