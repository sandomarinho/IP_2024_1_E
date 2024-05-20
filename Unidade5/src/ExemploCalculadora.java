import java.util.Scanner;

public class ExemploCalculadora {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double numero1;
    char operador;
    double numero2;
    double resultadoValor = 0;
    boolean resultadoImprime = true;
    char fim;

    do {

      // Entrada
      System.out.print(" Entre com 1a termo: ");
      numero1 = teclado.nextInt();

      System.out.println(" _ Entre com a opção: ");
      System.out.println(" ___ Soma          [+]");
      System.out.println(" ___ Subtração     [-]");
      System.out.println(" ___ Multiplicação [*]");
      System.out.println(" ___ Divisão       [/]");
      operador = teclado.next().charAt(0);

      System.out.print(" Entre com 2a termo: ");
      numero2 = teclado.nextInt();

      resultadoValor = 0;
      resultadoImprime = true;

      // _____ Calculadora usando Switch
      switch (operador) {
        case '+':
          resultadoValor = numero1 + numero2;
          break;
        case '-':
          resultadoValor = numero1 - numero2;
          break;
        case '*':
          resultadoValor = numero1 * numero2;
          break;
        case '/':
          if (numero2 != 0) {
            resultadoValor = numero1 / numero2;
          } else {
            resultadoImprime = false;
            System.out.println("Divisão por zero!!!");
          }
          break;

        default:
          resultadoImprime = false;
          System.out.println("Simbolos Incorreto!!!");
          break;
      }
      // Saída
      if (resultadoImprime) {
        System.out.println("Resultado: " + resultadoValor);
      }

      System.out.print(" Você quer usar a Super Calculadora (S/N): ");
      fim = teclado.next().charAt(0);
      fim = Character.toUpperCase(fim);  
    } while (fim == 'S');

    teclado.close();
  }
}
