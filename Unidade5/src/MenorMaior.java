/*
_ Só números positivos
Idade pessoa serres humanos ,,,
Entre 3 digitados qual é o menor e o maior.
Qual é o menor e o maior netre os valores digitados, até se dgitar -1
*/

import java.util.Scanner;

public class MenorMaior {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor; int menor = 9999; int maior = -1;
    for (int i = 1; i <= 3; i++) {
      System.out.println("Valor:"); 
      valor = teclado.nextInt();
      if (valor < menor) {
        menor = valor;
      }
      if (valor > maior) {
        maior = valor;
      }
    }

    System.out.println("Valor:"); 
    valor = teclado.nextInt();
    menor = valor; maior = valor;
    for (int i = 1; i <= 2; i++) {
      System.out.println("Valor:"); 
      valor = teclado.nextInt();
      if (valor < menor) {
        menor = valor;
      }
      if (valor > maior) {
        maior = valor;
      }
    }


    teclado.close();
  }
}
