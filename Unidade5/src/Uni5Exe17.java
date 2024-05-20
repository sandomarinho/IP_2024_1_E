import java.util.Scanner;

public class Uni5Exe17 {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpa console

    Scanner teclado = new Scanner(System.in);
    int atletaInscricao = 0;
    int atletaAltura = 0;
    int atletaMaisAltoInscricao = 0;
    int atletaMaisAltoAltura = 0;
    int atletaMaisBaixoInscricao = 0;
    int atletaMaisBaixoAltura = 0;
    double atletaAlturaMediaSoma = 0;
    double atletaAlturaMediaQtd = 0;

    // consiste o primeiro atleta
    System.out.println("Atleta inscrição: ");
    atletaInscricao = teclado.nextInt();
    if (atletaInscricao != 0) {
      System.out.println("Atleta altura: ");
      atletaAltura = teclado.nextInt();
      atletaMaisAltoInscricao = atletaInscricao;
      atletaMaisAltoAltura = atletaAltura;
      atletaMaisBaixoInscricao = atletaInscricao;
      atletaMaisBaixoAltura = atletaAltura;
      atletaAlturaMediaSoma += atletaAltura;  
      atletaAlturaMediaQtd++;
    }

    // consiste próximos atletas
    while (atletaInscricao != 0) {
      System.out.println("Atleta inscrição: ");
      atletaInscricao = teclado.nextInt();
      if (atletaInscricao != 0) {
        System.out.println("Atleta altura: ");
        atletaAltura = teclado.nextInt();
        if (atletaAltura > atletaMaisAltoAltura) {
          atletaMaisAltoInscricao = atletaInscricao;
          atletaMaisAltoAltura = atletaAltura;
        }
        if (atletaAltura < atletaMaisBaixoAltura) {
          atletaMaisBaixoInscricao = atletaInscricao;
          atletaMaisBaixoAltura = atletaAltura;
        }
        atletaAlturaMediaSoma += atletaAltura;  
        atletaAlturaMediaQtd++;
        }
    }

    System.out.println(" __ Atleta mais alto: ");
    System.out.println(" Inscrição: "+atletaMaisAltoInscricao);
    System.out.println(" Altura:    "+atletaMaisAltoAltura);

    System.out.println(" __ Atleta mais baixo: ");
    System.out.println(" Inscrição: "+atletaMaisBaixoInscricao);
    System.out.println(" Altura:    "+atletaMaisBaixoAltura);

    double atletaAlturaMedia = (atletaAlturaMediaSoma / atletaAlturaMediaQtd);
    System.out.println(" Altura média do grupo de atletas:    "+atletaAlturaMedia);
   
    teclado.close();
  }
}