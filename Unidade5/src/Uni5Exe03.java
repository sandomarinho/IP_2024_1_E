public class Uni5Exe03 {
  public static void main(String[] args) {
    double soma = 0;

    // Opção A: iterador como double
    for (double i = 1; i <= 100; i++) {
      soma += 1 / i;
    }
    System.out.println(soma);
    
    // Opção B: cast para double no numerador, poderia ser no denominador
    soma = 0;
    for (int i = 1; i <= 100; i++) {
      soma += (double) 1 /  i;
    }
    System.out.println(soma);
    
    // Opção C: definindo o numerador como double
    soma = 0;
    for (int i = 1; i <= 100; i++) {
      soma +=  1.0 /  i;
    }
    System.out.println(soma);

    // Opção D: usando variáveis fora do laço do tipo double
    soma = 0;
    double numerador = 1;
    double denominador = 1;
    for (int i = 1; i <= 100; i++) {
      soma += numerador / denominador;
      denominador++;
    }
    System.out.println(soma);

  }
}
