/*
//__ Entradas: 

ler(idadeMarquinhos)
ler(idadeZezinho)
ler(idadeLuluzinha)

//__ Processos: 

menor idade

//__ Saídas: 

imprimir("O caçula é: ")

*/
import java.util.Scanner;

public class Uni4Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int idadeMarquinhos, idadeZezinho, idadeLuluzinha;

    // __ Entradas:
    System.out.println("Entrea c/ a idade do Marquinhos: ");
    idadeMarquinhos = teclado.nextInt();
    System.out.println("Entrea c/ a idade do Zezinho: ");
    idadeZezinho = teclado.nextInt();
    System.out.println("Entrea c/ a idade do Luluzinha: ");
    idadeLuluzinha = teclado.nextInt();

    // Opção A
    if ((idadeMarquinhos < idadeZezinho) && (idadeMarquinhos < idadeLuluzinha)) {
      System.out.println("Caçula: Marquinhos");
    }
    if ((idadeZezinho < idadeMarquinhos) && (idadeZezinho < idadeLuluzinha)) {
      System.out.println("Caçula: Zezinho");
    }
    if ((idadeLuluzinha < idadeMarquinhos) && (idadeLuluzinha < idadeZezinho)) {
      System.out.println("Caçula: Luluzinha");
    }

    // Opção B
    if ((idadeMarquinhos < idadeZezinho) && (idadeMarquinhos < idadeLuluzinha)) {
      System.out.println("Caçula: Marquinhos");
    } else {
      if (idadeZezinho < idadeLuluzinha) {
        System.out.println("Caçula: Zezinho");
      } else {
        System.out.println("Caçula: Luluzinha");
      }
    }

    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___
idadeMarquinhos = 10 -> caçula
idadeZezinho = 20
idadeLuluzinha = 30

_ Caso 2 ___
idadeMarquinhos = 20
idadeZezinho = 10 -> caçula
idadeLuluzinha = 30

_ Caso 3 ___
idadeMarquinhos = 20
idadeZezinho = 30
idadeLuluzinha = 10 -> caçula

*/