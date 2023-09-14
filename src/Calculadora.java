import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    
    Scanner user = new Scanner(System.in);

    double primeiroNumero;
    double segundoNumero;
    String operacao;
    double resultado;

    System.out.println("Calculadora (numero1 + numero2 + operação = resultado)");
    System.out.println("------");

    System.out.print("Digite o primeiro número: ");
    primeiroNumero = user.nextDouble();

    System.out.print("Digite o segundo número: ");
    segundoNumero = user.nextDouble();

    System.out.print("Digite a operação: somar, subtrair, multiplicar ou dividir:");
    operacao = user.next();

    resultado = 0;

    switch (operacao) {
      case "somar":
        resultado = primeiroNumero + segundoNumero;
        break;
    
      case "multiplicar":
        resultado = primeiroNumero * segundoNumero;
        break;
      
      case "subtrair":
        resultado = primeiroNumero - segundoNumero;
        break;
        
      case "dividir":
      if(segundoNumero != 0) {
        resultado = primeiroNumero / segundoNumero;
      } else {
        System.out.println("Erro ao dividr por zero!");
        System.exit(1);
      }

        break;

      default:
        System.out.println("Operação inválida!");
        System.exit(1);
    }
      System.out.print("O resultado é: " + resultado);
  }
}
