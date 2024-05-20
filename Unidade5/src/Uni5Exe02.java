public class Uni5Exe02 {
  public static void main(String[] args) {

    // Opção A
    int somaPar = 0;
    int somaImpar = 0;
    for (int numero = 1; numero <= 100; numero++) {
      if ((numero % 2) == 0) {
        somaPar += numero;
      } else {
        somaImpar += numero;
      }
    }
    System.out.println("somaPar: " + somaPar);
    System.out.println("somaImpar: " + somaImpar);

    // Opção B
    somaPar = 0;
    for (int i = 2; i <= 100; i+=2) {
      somaPar += i;
    }
    somaImpar = 0;
    for (int i = 1; i <= 100; i+=2) {
      somaImpar += i;
    }
    System.out.println("somaPar: " + somaPar);
    System.out.println("somaImpar: " + somaImpar);

  }
}
