import java.util.Scanner;
public class Uni5Exe31 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		String nomeHospede;
		int numeroDiarias;
		int contasEncerradas = 0;
		float valorPago;

		do {
			System.out.println("Escolha a opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1: 
				System.out.println(" __ Encerrar a conta de um hóspede __ INFORME:");
				System.out.println("  Primeiro nome do hospede: ");
				nomeHospede = teclado.next();
				System.out.println("  Número de diárias: ");
				numeroDiarias = teclado.nextInt();
				valorPago = numeroDiarias*50;
				if (numeroDiarias < 15) {	// menos de 15 diárias
					valorPago += 7.50 * numeroDiarias;
				} else {
					if (numeroDiarias == 15) { // 15 diárias
						valorPago += 6.50 * numeroDiarias;
					} else {
						valorPago += 5.00 * numeroDiarias;  // mais de 15 diárias
					}
				}
				System.out.println("Nome: "+nomeHospede);
				System.out.println("Total a ser pago: "+valorPago);
				contasEncerradas += 1;
				break;
			case 2: 
				System.out.println(" __ Verificar número de contas encerradas __");
				System.out.println("    contas encerradas: "+contasEncerradas);
				break;
			case 3:
				System.out.println("sair _______________");
				break;
			default:
				System.out.println(" .. opção inválida.");
				break;
			}
		} while (opcao != 3);
		teclado.close();
	}
}
