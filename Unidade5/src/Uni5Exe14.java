/*
escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e
(lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: % = (PV
- PC) / PC * 100; determine e escreva o valor total de compra e de venda de
todas as mercadorias, assim como o lucro total.

*/

import java.util.Scanner;

public class Uni5Exe14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String mercadoriaNome;
    double mercadoriaPC;
    double mercadoriaPCSoma = 0;
    double mercadoriaPV;
    double mercadoriaPVSoma = 0;
    int lucroQtdMenor10Perc = 0;
    int lucroQtdEntre10e20Perc = 0;
    int lucroQtdMaior20Perc = 0;
    double lucro;
    double lucroSoma = 0;
    double lucroPerc;

    for (int i = 1; i <= 20; i++) {
      System.out.println(" _ Informe para mercadoria: " + i);
      System.out.print("nome: ");
      mercadoriaNome = teclado.next();
      System.out.print("preço de compra (PC): ");
      mercadoriaPC = teclado.nextDouble();
      mercadoriaPCSoma += mercadoriaPC;
      System.out.print("preço de venda (PV): ");
      mercadoriaPV = teclado.nextDouble();
      mercadoriaPVSoma += mercadoriaPV;

      lucro = mercadoriaPV - mercadoriaPC;
      lucroSoma += lucro;
      lucroPerc = lucro / mercadoriaPC * 100;
      if (lucroPerc < 10) {
        lucroQtdMenor10Perc++;
      } else {
        if (lucroPerc > 20) {
          lucroQtdMaior20Perc++;
        } else {
          lucroQtdEntre10e20Perc++;
        }
      }
    }

    System.out.println("Qtd mercadorias c/ lucro < 10%: " + lucroQtdMenor10Perc);
    System.out.println("Qtd mercadorias c/ 10% <= lucro <= 20%: " + lucroQtdEntre10e20Perc);
    System.out.println("Qtd mercadorias c/ lucro > 20%: " + lucroQtdMaior20Perc);

    System.out.println("Valor total de compra: " + mercadoriaPCSoma);
    System.out.println("Valor total de venda: " + mercadoriaPVSoma);
    System.out.println("Valor total de lucro: " + lucroSoma);

    teclado.close();
  }
}
