public class Uni5Questionario10 {
  public static void main(String[] args) {
    int contador, total, n, x;
    contador = 0;
    total = 1;
    n = total;
    do {
      n = n + 1;
      System.out.println(n + 1);
      total = total - contador;
      if (total == 1) {
        total = total + 1;
      }
    } while (contador <= 0);
    System.out.println(total);
    x = total * total;
    System.out.println(x);
  }
}

/*
 * Resposta: Durante a execução do algoritmo, será escrito todos os números
 * superiores a 3 (incluindo o valor 3).
 */
