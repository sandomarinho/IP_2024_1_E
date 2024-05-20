public class Uni5Questionario03 {
  public static void main(String[] args) {
    int a, b, q;
    a = 1;
    q = 4;
    b = 0;
    for (int contador = a; contador < q; contador++) {
      a = a * (-q);
      b = b + contador - 1;
    }
    q = (-q - 1) * (-1);
  }
}

// a: -64
// b: 3
// q: 5