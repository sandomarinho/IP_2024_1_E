// para calcaular as sequências
//		-----------------------------
//		| seq1 | seq2 | seq3 | seq4 |
//		| 0..9 | 0..9 | 0..9 | 0..9 |
//			..combinações: 10 elevado 4 = 10000
//
public class ExemploCadeado {

	public static void main(String[] args) {
		int qtdTotal = 0;

		for (int seq1 = 0; seq1 <= 9; seq1++) {
			for (int seq2 = 0; seq2 <= 9; seq2++) {
				for (int seq3 = 0; seq3 <= 9; seq3++) {
					for (int seq4 = 0; seq4 <= 9; seq4++) {
						System.out.println("[" + seq1 + "," + seq2 + "," + seq3 + "," + seq4 + "]");
						qtdTotal += 1;
					}
				}
			}
		}
		System.out.println("Total: " + qtdTotal);
	}
}
