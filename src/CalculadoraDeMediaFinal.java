import java.util.Scanner;

public class CalculadoraDeMediaFinal {
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    double primeiraNota;
    double segundaNota;
    double terceiraNota;
    double mediaFinal;

    System.out.println("Vamos calcular a sua média de notas semestrais.");
    System.out.println("------");
    
    System.out.print("Insira a sua primeira nota: ");
    primeiraNota = user.nextDouble();

    System.out.print("Insira a sua segunda nota: ");
    segundaNota = user.nextDouble();

    System.out.print("Insira a sua terceira nota: ");
    terceiraNota = user.nextDouble();

    mediaFinal = ((primeiraNota + segundaNota + terceiraNota) / 3 );

    System.out.printf("Sua média final é: %.2f%n", mediaFinal);

    user.close();

  }
}
