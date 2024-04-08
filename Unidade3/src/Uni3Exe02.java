/*

__ Enunciado:
Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um
programa para calcular e exibir o valor de desconto a ser dado num par de
sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos
deve ser informado pelo usuário. Como resultado, o programa deverá exibir as
seguintes mensagens:

O valor do desconto é de R$ xxx O preço do par de sapatos com desconto é R$ xxx

__ Análise: OK

__ Gordura: 

Uma loja de calçados está concedendo Escreva um programa para calcular e exibir
o

//__ Entradas: 

preço do par de sapatos

//__ Processos: 

12% de desconto

precoSapato valorDesconto precoSapatoDesconto

//__ Saídas: 

O valor do desconto é de R$ xxx O preço do par de sapatos com desconto é R$ xxx

*/

import java.util.Scanner;

public class Uni3Exe02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // __ Variáveis:
    double sapatoPreco = 0;
    double desconto = 0.12;
    double sapatoDesconto = 0;
    double sapatoPrecoDesconto = 0;

    // __ Entradas:
    System.out.println("Entre preço sapato (par): ");
    sapatoPreco = teclado.nextDouble();

    // __ Processos: 12% de desconto
    sapatoDesconto = sapatoPreco * desconto;
    sapatoPrecoDesconto = sapatoPreco - sapatoDesconto;

    // __ Saídas:
    System.out.println("O valor do desconto é de R$ " + sapatoDesconto);
    System.out.println("O preço do par de sapatos com desconto é R$ " + sapatoPrecoDesconto);

    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___
  sapatoPreco = 200,00
  desconto = 0.12
  sapatoDesconto = 24.0
  sapatoPrecoDesconto = 176.0

_ Caso 2 ___
  sapatoPreco = 123,45
  desconto = 0.12
  sapatoDesconto = 14.814
  sapatoPrecoDesconto = 108.636

*/