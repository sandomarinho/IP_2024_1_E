
public class ExemploForFor {

	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			System.out.println(i);
		}
		for (int j = 0; j <= 2; j++) {
			System.out.println(j);
		}
		System.out.println("-----");
		for (int i = 0; i <= 2; i++) {
			for (int j = 2; j >= 0; j--) {
				System.out.println("[i: " + i + ",j: " + j + "]");
			}
		}
	}
}
