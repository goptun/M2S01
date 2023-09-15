import java.util.Scanner;

public class CalculadoraPAePG {
  public static void main(String[] args) {
    
    Scanner user = new Scanner(System.in);
    
    System.out.println("------------------------------------------------");
    System.out.println("Calculadora de Progressão Aritmética e Geométrica");
    System.out.println("------------------------------------------------");

    System.out.print("Insira o valor inicial: ");
    int valorInicial = user.nextInt();

    System.out.print("Insira o valor da raiz: ");
    int raiz = user.nextInt();

    System.out.print("Digite (1) PA ou (2) PG: ");
    int escolha = user.nextInt();

    System.out.println("------------------------------------------------");
    System.out.println("Seguência: ");

    if (escolha == 1) {
      for (int i = 0; i < 10; i++) {
        double sequencia = valorInicial + i * raiz;
        System.out.printf("%.0f%n", sequencia);
      }
    } else if (escolha == 2) {
      for (int i = 0; i < 10; i++) {
        double sequencia = valorInicial * Math.pow(raiz, i);
        System.out.printf("%.0f%n", sequencia);
      }
    }
    System.out.println("------------------------------------------------");
    user.close();
  }
}