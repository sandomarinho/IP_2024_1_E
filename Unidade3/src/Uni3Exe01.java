/*

__ Enunciado:
Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as
dimensões de um terreno e depois exibir a área do terreno.

__ Análise: OK

__ Gordura: 

Uma imobiliária vende apenas Faça um programa para 

//__ Entradas: 

ler(largura) ler(comprimento)

//__ Processos: 

area = largura x comprimento

//__ Saídas: // área do terreno

imprimir(area)

*/

import java.util.Scanner;

public class Uni3Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // __ Variáveis:
    double largura;
    double comprimento;

    // __ Entradas:
    System.out.print("Entre com a largura: ");
    largura = teclado.nextDouble();
    System.out.print("Entre com a comprimento: ");
    comprimento = teclado.nextDouble();

    // __ Processos:
    double area = largura * comprimento;

    // __ Saídas: área do terreno

    System.out.println("A área do terreno: " + area);

    teclado.close();
  }
}

/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * largura: 2
 * comprimento: 3
 * area: 6
 * 
 * _ Caso 2 ___
 * largura: 3.7
 * comprimento: 2.4
 * area: 8.88
 */