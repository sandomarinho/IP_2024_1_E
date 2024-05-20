// 0 + 0 = 0 -> 0
// 0 + 1 = 1 -> 1
// 0 + 2 = 2 -> 4
// ...
// 0 + 99 = 99 -> 9.801
// ...
// 1 + 0 = 1 -> 1
// 1 + 1 = 2 -> 4
// 1 + 2 = 3 -> 9
// ...
// 1 + 99 = 100 -> 10.000
// ...
// 2 + 0 = 2 -> 4
// 2 + 1 = 3 -> 9
// 2 + 2 = 4 -> 16
// ..
// O número 3025 possui a seguinte característica:​
// 30+25=55 e 55² = 3025​.

public class Uni5Exe10 {

	public static void main(String[] args) {
		int soma = 0;
		int potencia = 0;
		String terStr1, terStr2;
		int cont = 0;

		for (int ter1 = 0; ter1 <= 10000; ter1++) {
			for (int ter2 = 0; ter2 <= 10000; ter2++) {
				soma = ter1 + ter2;
				potencia = soma * soma;
				terStr1 = potencia + "";
				terStr2 = ter1 + "" + ter2;
				if (terStr1.equals(terStr2)) {
					cont++;
					System.out.println("[" + cont + "] " + ter1 + " + " + ter2 + " = " + soma + " -> " + potencia);
					if (cont >= 10) {
						break;
					}
				}
			}
			if (cont >= 10) {
				break;
			}
		}
		System.out.println("----");
	}

}
