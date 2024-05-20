import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");

		double alturaMulherSoma = 0;
		int alturaMulherQtd = 0;
		double alturaGrupoSoma = 0;
		int alturaGrupoQtd = 0;

		System.out.println("Altura (cm): ");
		int altura = teclado.nextInt();
		while (altura != 0) {
			System.out.println("Sexo (m/f): ");
			char sexo = teclado.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			if (sexo == 'F') {
				alturaMulherSoma += altura;
				alturaMulherQtd++;
			}
			alturaGrupoSoma += altura;
			alturaGrupoQtd++;
			System.out.println("Altura (cm): ");
			altura = teclado.nextInt();
		}

		double alturaMulherMedia = alturaMulherSoma / alturaMulherQtd;
		double alturaGrupoMedia = alturaGrupoSoma / alturaGrupoQtd;

		System.out.println("Média das alturas das mulheres: " + df_2.format(alturaMulherMedia));
		System.out.println("Média das alturas do grupo:     " + df_2.format(alturaGrupoMedia));

		teclado.close();
	}
}

// ____ Valores para Teste ____ 
// altura sexo
// 140 f
// 176 m
// 135 f
// 198 m
// 157 f
// 167 f
// 0
//
// media mulher: 149,75
// media grupo: 162,17