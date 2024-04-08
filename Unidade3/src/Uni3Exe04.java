import java.util.Scanner;

public class Uni3Exe04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe as três notas do aluno.");
    System.out.print("  nota1: ");
    double nota1 = teclado.nextDouble();
    System.out.print("  nota2: ");
    double nota2 = teclado.nextDouble();
    System.out.print("  nota3: ");
    double nota3 = teclado.nextDouble();

    // Processo
    // double mediaPonderada = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
    double mediaPonderada = (nota1 * 0.5) + (nota2 * 0.3) + (nota3 * 0.2);

    // Saída
    System.out.println(" Média ponderada: " + mediaPonderada);

    teclado.close();
  }
}
