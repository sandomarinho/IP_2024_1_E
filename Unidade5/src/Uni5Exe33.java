import java.util.Scanner;

public class Uni5Exe33 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int votoCand1 = 0, votoCand2 = 0, votoCand3 = 0, votoCand4 = 0;
    int votoNulo = 0, votoBranco = 0;
    int voto;
    do {
      System.out.println("Entre com o voto: ");
      voto = teclado.nextInt();
      switch (voto) {
        case 1:
          votoCand1++;
          break;
        case 2:
          votoCand2++;
          break;
        case 3:
          votoCand3++;
          break;
        case 4:
          votoCand4++;
          break;
        case 5:
          votoNulo++;
          break;
        case 6:
          votoBranco++;
          break;
        case 0:
          /* fim */ break;
        default:
          System.out.println("Opção incorreta");
          break;
      }
    } while (voto != 0);

    double votoTotal = votoCand1 + votoCand2 + votoCand3 + votoCand4 + votoNulo + votoBranco;
    double votoPerBranco = (votoBranco / votoTotal) * 100;
    double votoPerNulo = (votoNulo / votoTotal) * 100;

    System.out.println("Tot. cand1:        " + votoCand1);
    System.out.println("Tot. cand2:        " + votoCand2);
    System.out.println("Tot. cand3:        " + votoCand3);
    System.out.println("Tot. cand4:        " + votoCand4);
    System.out.println("Tot. nulo:         " + votoNulo);
    System.out.println("Tot. branco:       " + votoBranco);
    System.out.println("Tot. perc. branco: " + votoPerBranco);
    System.out.println("Tot. perc. nulo:   " + votoPerNulo);
    teclado.close();
  }
}
