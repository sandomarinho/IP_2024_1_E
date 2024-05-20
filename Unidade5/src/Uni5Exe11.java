public class Uni5Exe11 {

	public static void main(String[] args) {

		int prod = 1;
		int somaProd = 1;

		System.out.println("Hora[1] " + somaProd);
		for (int hora = 1; hora < 16; hora++) {
			prod *= 3;
			somaProd += prod;
			System.out.println("Hora[" + (hora + 1) + "] " + somaProd);
		}
	}

}

// 1 hora: 1
// 2 hora: 3 -> 4
// 3 hora: 9 -> 13
// 4 hora: 27 -> 28
// 5 hora: 81 -> 121
