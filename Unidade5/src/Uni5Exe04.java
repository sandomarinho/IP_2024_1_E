public class Uni5Exe04 {
  public static void main(String[] args) {
    double numerador = 3;
    double denominador = 2;
    double acumulador = 2;
    double soma = 0;
    
    for (int i = 1; i <= 20; i++) {
      soma = soma + ( numerador / denominador);
      numerador += 2;
      acumulador += 2;
      denominador += acumulador;
    }
    System.out.println("Soma: " + soma);
  }
}
