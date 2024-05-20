import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe20 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000000000");

    double massaInicial = 0;
    System.out.print("Informe a massa inicial em Kg: ");
    massaInicial = teclado.nextDouble();
    double massa = massaInicial * 1000; // kilos para gramas

    double tempo = 0;
    while (massa > 0.5) {
      massa /= 2;
      tempo += 50;
    }

    System.out.println("  massa inicial (kg): " + massaInicial);
    System.out.println("  massa final (kg): " + df.format((massa / 1000))); // gramas para kilos
    System.out.println("  tempo (segundos): " + tempo);

    teclado.close();
  }

}

/*
Entrada: 1 kg 
1000, 500, 250, 125, 62.5, 31.25, 15.625, 7.8125, 3.90625, 1.953125, 0.9765625

massa inicial (kg): 1
massa final (kg): 0.0004882812
tempo (segundos): 550
 */
