import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    System.out.print("Insira um número inteiro: ");
    int numeroInteiro = user.nextInt();

    if (numeroInteiro % 2 == 0) {
      System.out.println("Esse número é par.");
    } else {
      System.out.println("Esse número é impar.");
    }

    user.close();
  }
}
