/*
informe o maior e o menor número.
*/

import java.util.Scanner;

public class Uni5Exe07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe qtd. de números: ");
    int n = teclado.nextInt();

    // Opção A: iniciar a variável valorMenor com o maior valor e variável valorMaior com menor valor possível da linguagem.
    double valorMenor = Double.MAX_VALUE;
    double valorMaior = Double.MIN_VALUE;
    double valor;
    for (int i = 1; i <= n; i++) {
      System.out.println("valor: ");
      valor = teclado.nextDouble();
      if (valor < valorMenor) {
        valorMenor = valor;
      }
      if (valor > valorMaior) {
        valorMaior = valor;
      }
    }
    System.out.println("menor: " + valorMenor);
    System.out.println("maior: " + valorMaior);

    // Opção B: ler o primeiro valor fora do láco, e depois ler os valores 2a até o último valor.
    // 1a valor
    System.out.println("valor: ");
    valor = teclado.nextDouble();
    valorMenor = valor;
    valorMaior = valor;
    for (int i = 2; i <= n; i++) {
      System.out.println("valor: ");
      valor = teclado.nextDouble();
      if (valor < valorMenor) {
        valorMenor = valor;
      }
      if (valor > valorMaior) {
        valorMaior = valor;
      }
    }
    System.out.println("menor: " + valorMenor);
    System.out.println("maior: " + valorMaior);

    //Opção C: se for o primeiro valor lido atribuir ao valorMenor e valorMaior denrto do laço usando uma condição.
    for (int i = 1; i <= n; i++){
      System.out.print(" Informe o "+i+"º valor: ");
      valor = teclado.nextDouble();
      if (i == 1){
        valorMenor = valor;
        valorMaior = valor;
      }else{
        if (valor < valorMenor){
          valorMenor = valor;
        }    
                
        if (valor > valorMaior){
          valorMaior = valor;
        }    
      }
    }
    System.out.println("menor: " + valorMenor);
    System.out.println("maior: " + valorMaior);

    teclado.close();
  }
}
