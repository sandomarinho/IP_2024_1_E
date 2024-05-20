import java.util.Scanner;

public class Uni5Exe26_B {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor máximo de pedágio: ");
		final double pedagioMaximo = teclado.nextDouble(); 
		
		System.out.println("   Pedágio    Distância");
		
		double pedagioCusto = 0;
		int pedagioDistancia = 0;
		int pedagioQtdNega = 0;
		int pedagioQtdTrechos = 0;
		int pedagioQtdPaga150 = 0;

		System.out.println("Custo: ");
		pedagioCusto = teclado.nextDouble();
		while (pedagioCusto >= 0) {
			System.out.println("Distância: ");
			pedagioDistancia = teclado.nextInt(); 

			if (pedagioCusto > pedagioMaximo) { //a
				pedagioQtdNega++;
			}
			pedagioQtdTrechos++; //b
			if (pedagioDistancia > 150) { //c
				if (pedagioCusto <= pedagioMaximo) {
					pedagioQtdPaga150++;
				}
			}
			System.out.println("Custo: ");
			pedagioCusto = teclado.nextDouble();
		}
		System.out.println(pedagioQtdNega+" (trechos com valor acima do qual ele nega-se a pagar)");
		System.out.println(pedagioQtdTrechos+" (quantidade de trechos informados)");
		System.out.println(pedagioQtdPaga150+" (trechos acima de 150km com valor aceito por ele)"); 
		teclado.close();
	}
}
