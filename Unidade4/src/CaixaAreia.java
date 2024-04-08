import java.util.Scanner;

public class CaixaAreia {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 10;

		numero = numero / 200;
		numero /= 200;
		numero++;
		System.out.println(numero);


		teclado.close();

	}
}
