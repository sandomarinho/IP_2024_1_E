/*
// Entrada
leia o número de horas trabalhadas em um mês
leia o valor por hora

// Processo
a) salarioTotal
b) condição: mais de 40 horas receberá hora extra
    acrescido das horas extras um acréscimo de 50%

// Saída
escreva o salário total do funcionário
*/

import java.util.Scanner;

public class Uni4Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // #region Entrada
    System.out.println("Entre com as horas trabalhadas no mês: ");
    int horasMes = teclado.nextInt();
    System.out.println("Entre com o valor pago por hora: ");
    double horasValor = teclado.nextDouble();
    // #endregion

    // #region Processo
    double salarioTotal = horasMes * horasValor;
    if (horasMes > 160) { // mês c/ 4 semanas, semana 40 horas
      double salarioExtra = (horasMes - 160) * (horasValor / 2);
      salarioTotal = salarioTotal + salarioExtra;
    }
    // #endregion

    // #region Saída
    System.out.println("O salário total é: " + salarioTotal);
    // #endregion
    
    teclado.close();
  }
}
/* Valores Testes 
    _ Caso 1 ___ não tem hora extra <= 160 horas
  horasTrabalhadasMes = 150
  horasValores = 10,00
  salarioLiquido = horasTrabalhadasMes * horasValores
  horasExtra = 0
  salarioBruto = salarioLiquido + horasExtra => 1.500,00
  
  horasTrabalhadasMes = 160
  horasValores = 10,00
  salarioLiquido = horasTrabalhadasMes * horasValores
  horasExtra = 0
  salarioBruto = salarioLiquido + horasExtra => 1.600,00
  
  _ Caso 2 ___ tem hora extra
  horasTrabalhadasMes = 161
  horasValores = 10,00
  salarioLiquido = horasTrabalhadasMes * horasValores => 1.610,00
  horasExtra = 1 => (horasValores * 0.5) * 1
  salarioBruto = salarioLiquido + horasExtra => 1.615,00
  
  horasTrabalhadasMes = 350
  horasValores = 10,00
  salarioLiquido = horasTrabalhadasMes * horasValores => 3.500,00
  horasExtra = 190 => 190 * 5,00
  salarioBruto = salarioLiquido + horasExtra => 4.450,00
  
  _ Caso 3 ___ tem hora extra, com valor casas decimais
  horasTrabalhadasMes = 161
  horasValores = 10,50
  salarioLiquido = horasTrabalhadasMes * horasValores => 1.690,50
  horasExtra = 1 => (horasValores * 5,25) * 1
  salarioBruto = salarioLiquido + horasExtra => 1.695,75
 */
