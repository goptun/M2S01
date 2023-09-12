import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {
    
    Scanner user = new Scanner(System.in);

    System.out.print("Digite sua altura: ");
    double altura = user.nextDouble();

    System.out.print("Digite seu peso: ");
    int peso = user.nextInt();

    double imc = (peso / (altura * altura));

    System.out.println("Seu IMC é: " + imc);

    user.close();
  }
}
