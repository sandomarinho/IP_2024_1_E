public class ExemploMatriz {
  public static void main(String[] args) {
    final int matLin = 3, matCol = 4;
    int mat[][] = new int[matLin][matCol];
    int valor = 1;
    // Adicionar
    // linha -> coluna
    for (int l = 0; l < matLin; l++) { // linhas
      for (int c = 0; c < matCol; c++) { // colunas
        mat[l][c] = valor;
        valor++;
      }
    }
    // Escrever
    for (int i = 0; i < matCol - 1; i++) {
      System.out.print("------");
    }
    System.out.println();
    for (int l = 0; l < matLin; l++) {
      for (int c = 0; c < matCol; c++) {
        if (mat[l][c] < 10) { // _1
          System.out.print("|  " + mat[l][c] + " ");
        } else { // 10
          System.out.print("| " + mat[l][c] + " ");
        }
      }
      System.out.println("|");
    }
    for (int i = 0; i < matCol - 1; i++) {
      System.out.print("------");
    }
    System.out.println();
  }
}
