import java.util.Scanner;

public class Uni5Exe06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float altura;
		float soma = 0;
		float media;
		for (int cont = 1; cont <= 20; cont++) {
			System.out.println("Entre com a altura da pessoa["+cont+"]: ");
			altura = teclado.nextFloat();
			soma += altura;
		}
		media = soma / 20;
		System.out.println("A média das alturas é: "+media);
		teclado.close();
	}
	
}
