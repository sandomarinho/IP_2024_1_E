/*
as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o
valor do odômetro e a quantidade de combustível comprado para reabastecer o
veículo (suponha que o tanque foi enchido a cada parada). Descreva um algoritmo
que leia o número total de reabastecimentos feitos e os dados registrados
relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada; a quilometragem
média obtida por litro de combustível em toda a viagem.

*/

import java.util.Scanner;

public class Uni5Exe13 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int qtdReabastecimentos = 0;
    int km = 0, kmSoma = 0;
    int qtdCombustivel = 0, qtdCombustivelSoma = 0;

    System.out.println("Informe o número total de reabastecimentos: ");
    qtdReabastecimentos = teclado.nextInt();
    for (int i = 0; i < qtdReabastecimentos; i++) {
      System.out.println("Informe a km da parada: ");
      km = teclado.nextInt();
      kmSoma += km;
      System.out.println("Informe a qtd. de combustível: ");
      qtdCombustivel = teclado.nextInt();
      qtdCombustivelSoma += qtdCombustivel;

      System.out.println(" _ parada " + (i + 1) + ":");
      System.out.println(" km por litro: " + ((double) km / qtdCombustivel));
    }
    System.out.println(" __ quilometragem média obtida por litro:" + ((double) kmSoma / qtdCombustivelSoma));

    teclado.close();
  }

}
