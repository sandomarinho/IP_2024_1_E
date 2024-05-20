public class Uni5Questionario08 {
  public static void main(String[] args) {
    int a, b, c;
    a = 0;
    b = 0;
    c = 0;
    for (int i = 1; i < 7; i++) {
      if (i % 2 == 0) {
        a = a + i + 1;
      } else {
        a = a - i;
        b = b - 1;
      }
      if (c * i == 2) {
        c = b;
      }
      c = c - 1;
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
