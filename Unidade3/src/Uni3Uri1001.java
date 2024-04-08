/*
__ Enunciado:

Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e
B atribuindo o seu resultado na variável X. Imprima X conforme exemplo
apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo
especificado e não esqueça de imprimir o fim de linha após o resultado, caso
contrário, você receberá "Presentation Error". __ Análise: Ok

__ Gordura: 


//__ Variáveis:

int A; int B; int X; 

//__ Entradas:

A entrada contém 2 valores inteiros.

Ler(A); Ler(B);

//__ Processos:

X = A + B;

//__ Saídas: 

Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e
pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de
igualdade, conforme o exemplo abaixo.

Imprima("X = " + X);
*/

import java.util.Scanner;

public class Uni3Uri1001 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // __ Variáveis:
    int A;
    int B;
    int X;

    // __ Entradas:
    A = teclado.nextInt();
    B = teclado.nextInt();

    // __ Processos:
    X = A + B;

    // __ Saídas:
    System.out.println("X = " + X);

    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___
10
9
X = 19

_ Caso 2 ___
-10
4
X = -6

_ Caso 3 ___
15
-7
X = 8

*/