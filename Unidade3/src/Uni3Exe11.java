/*
__ Enunciado: 
Descreva um programa que dado uma temperatura em °C informe o seu
valor em °F. Fórmula: °F = (9/5) °C + 32

//__ Entradas: 
ler(grausC)

//__ Processos: 
grausF = (9/5) grausC + 32

//__ Saídas: 
imprimir(grausF)
*/

/*
__ Valores de Testes: 
_ Caso 1 ___
grausC = 0
grausF = 32

_ Caso 2 ___
grausC = 26
grausF = 78,8

_ Caso 3 ___
grausC = 20,5
grausF = 68,9

*/

import java.util.Scanner;

public class Uni3Exe11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe a temperatura em °C: ");
    double temperaturaC = teclado.nextDouble();

    // Processo
    double temperaturaF = (9.0/5.0) * temperaturaC + 32;    // °F = (9/5) °C + 32

    //Saída
    System.out.println("A temperatura em °F: " + temperaturaF);

    teclado.close();
  }
}
