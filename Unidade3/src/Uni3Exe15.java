/*
__ Enunciado:
https://github.com/dalton-reis/disciplinaIpMat/blob/main/Unidade3/atividadeAula.md#uni3exe15java

Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima
a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)

__ Análise: 

ok

__ Gordura: 

Construa um programa para 

//__ Entradas: 

ler(numero)

//__ Processos: 

centenas = numero / 100;
restoCentenas = numero - (centenas * 100);

dezenas = restoCentenas / 10;
restoDezenas = restoCentenas - (dezenas * 10);

unidades = restoDezenas

//__ Saídas: 

imprimir(centenas,dezenas,unidades)
*/

import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Número inteiro (XYK): ");
    int numero = teclado.nextInt();

    // Processo A (uma forma de fazer)
    int centenas = numero / 100;
    int dezenas  = numero / 10   - (centenas * 10);
    int unidades = numero / 1    - (centenas * 100) - (dezenas * 10);

    // Processo B (outra forma de fazer o mesmo processo)
    centenas = numero / 100;
    int restoCentenas = numero - (centenas * 100);
    dezenas = restoCentenas / 10;
    int restoDezenas = restoCentenas - (dezenas * 10);
    unidades = restoDezenas;
        
    // Saída
    System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___

numero = 384
qtdCentena = 3
qtdDezena = 8
qtdUnidade = 4

*/
