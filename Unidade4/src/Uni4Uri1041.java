import java.util.Scanner;

public class Uni4Uri1041 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double coordX = teclado.nextDouble();
    double coordY = teclado.nextDouble();

    if (coordX == 0 && coordY == 0) {
      System.out.println("Origem");
    } else {
      if (coordX == 0) {
        System.out.println("Eixo Y");
      } else {
        if (coordY == 0) {
          System.out.println("Eixo X");
        } else {
          if (coordX > 0 && coordY > 0) {
            System.out.println("Q1");
          } else {
            if (coordX < 0 && coordY > 0) {
              System.out.println("Q2");
            } else {
              if (coordX < 0 && coordY < 0) {
                System.out.println("Q3");
              } else {
                System.out.println("Q4");
              }
            }
          }
        }
      }
    }

    teclado.close();
  }
}
