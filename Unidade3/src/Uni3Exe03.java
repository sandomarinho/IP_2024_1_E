/*
__ Enunciado: https://github.com/dalton-reis/disciplinaIpMat/blob/main/Unidade3/atividadeAula.md#uni3exe03java
Um motorista deseja abastecer seu tanque de combustível. Escreva
um programa para ler o preço do litro da gasolina e o valor do pagamento e
exibir quantos litros ele conseguiu colocar no tanque. 

__ Análise: OK

__ Gordura: 
Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para  e

//__ Entradas: 
ler o preço do litro da gasolina
ler o valor do pagamento

//__ Processos: 
qtdLitros = valor do pagamento / preço do litro da gasolina

//__ Saídas: 
exibir quantos litros ele conseguiu colocar no tanque

*/

import java.util.Scanner;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // __ Variáveis:
    double valorPagamento;
    double precoLitroGasolina;
    double qtdLitros;

    // __ Entradas:
    System.out.println("Informe o valor pago: ");
    valorPagamento = teclado.nextDouble();
    System.out.println("Informe o preço da gasoline (litro):");
    precoLitroGasolina = teclado.nextDouble();

    //__ Processos: 
    qtdLitros = valorPagamento / precoLitroGasolina;

    // __ Saídas:
    System.out.println("Quantidade de litros: " + qtdLitros);

    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___
  valorPagamento = 200,00
  precoLitroGasolina = 4,00
  qtdLitros = 50 litros

_ Caso 2 ___
  valorPagamento = 123,45
  precoLitroGasolina = 6,78
  qtdLitros = 18.207964601769913

*/