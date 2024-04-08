import java.util.Scanner;

public class Uni4Uri1042 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    int valor3 = teclado.nextInt();
    int valorMenor, valorMedio, valorMaior;

    if (valor1 < valor2 && valor1 < valor3) {
        valorMenor = valor1;
      if (valor2 < valor3) {
        valorMedio = valor2;
        valorMaior = valor3;
      }
      else {
          valorMedio = valor3;
          valorMaior = valor2;
      }
    }
    else {
      if (valor2 < valor3) {
        valorMenor = valor2;
        if (valor1 < valor3) {
          valorMedio = valor1;
          valorMaior = valor3;
        }
        else {
          valorMedio = valor3;
          valorMaior = valor1;
        }
      }
      else {
        valorMenor = valor3;
        if (valor1 < valor2) {
          valorMedio = valor1;
          valorMaior = valor2;
        }
        else {
          valorMedio = valor2;
          valorMaior = valor1;
        }
      }
    }
    System.out.println(valorMenor);
    System.out.println(valorMedio);
    System.out.println(valorMaior);
    System.out.println();
    System.out.println(valor1);
    System.out.println(valor2);
    System.out.println(valor3);

    teclado.close();
  }
}
