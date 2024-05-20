import java.util.Scanner;
public class Uni5Exe32 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println( "diaSemana (p): "); 
		int brancoQtd = tec.nextInt(); brancoQtd--;
		System.out.println( "diaMesQtd (n): "); 
		int diaMesQtd = tec.nextInt(); 
		
		System.out.println("-----------------------------");
		System.out.println("| D | S | T | Q | Q | S | S |");
		System.out.println("-----------------------------");
		
		int linha, coluna, diaMesAtual = 1;
		final int qtdDiasSemana = 7;
		
		int qtdLinhas = (brancoQtd + diaMesQtd) / qtdDiasSemana;
		if (((brancoQtd + diaMesQtd) % qtdDiasSemana) > 0) {
			qtdLinhas++;
		}
		
		linha = 1;
		while (linha <= qtdLinhas) {
			coluna = 1;
			while (coluna <= qtdDiasSemana) {
				if (brancoQtd > 0) {
					System.out.print("|   ");	
					brancoQtd--;
				} else {
					if (diaMesAtual <= diaMesQtd ) {
						if (diaMesAtual <= 9) { //1 digito
							System.out.print("|  "+diaMesAtual);				
						} else {
							System.out.print("| "+diaMesAtual);				
						}
						diaMesAtual++;
					} else {
						System.out.print("|   ");	
					}
				}
				coluna++;
			}
			System.out.println("|");
			System.out.println("-----------------------------");
			linha++;
		}
		tec.close();
	}
}
