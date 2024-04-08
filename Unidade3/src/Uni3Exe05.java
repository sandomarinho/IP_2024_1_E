/*
//__ Entradas: 
1x valorChip = 4.00
2x valorAnel = 3.50 = 7.00
ler(qtdFrangos)

//__ Processos: 
valorPorFrango = valorChip + (valorAnel * 2)
totalGastoGranja = qtdFrangos * valorPorFrango

//__ Saídas: 
imprimir(totalGastoGranja)

*/
/*
__ Valores de Testes: 
_ Caso 1 ___
1x valorChip = 4.00
2x valorAnel = 3.50 = 7.00
ler(qtdFrangos) = 10
valorPorFrango = valorChip + (valorAnel * 2) = 11.00
totalGastoGranja = qtdFrangos * valorPorFrango = 110.00
*/

import java.util.Scanner;

public class Uni3Exe05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe a qtd. de frangos:  ");
    int frangoQtd = teclado.nextInt();

    // Processo
    double frangoCustoIndividual = 4.00 /* chip */ + (3.50 * 2) /* alimento */;
    double frangoCustoTotal = frangoQtd * frangoCustoIndividual;

    // Saída
    System.out.println(" Gasto total: " + frangoCustoTotal);

    teclado.close();
  }
}
