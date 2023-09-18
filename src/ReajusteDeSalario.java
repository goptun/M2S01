import java.util.Scanner;

public class ReajusteDeSalario {
  public static void main(String[] args) {
    
    Scanner user = new Scanner(System.in);

    System.out.println("------------------------------------------------------------");
    System.out.print("Informe seu salário: ");
    double salarioAtual = user.nextDouble();
    
    user.close();
    
    double percentualReajuste = 0;
    double valorReajuste = 0;
    double valorNovoSalario = 0;

    if (salarioAtual == 0){
        System.out.println("------------------------------------------------------------");
        System.out.println("Seu salário deve ser maior que zero, tente novamente.");
      } else {

      if (salarioAtual <= 1200) {
      percentualReajuste = 20;
      } 

      else if (salarioAtual <= 1700){
      percentualReajuste = 15;
      }

      else if (salarioAtual <= 2500){
      percentualReajuste = 10;
      }

      else if (salarioAtual >= 2500){
      percentualReajuste = 5;
      }

      valorReajuste = (percentualReajuste / 100 ) * salarioAtual;
      valorNovoSalario = (salarioAtual + valorReajuste);
      System.out.println("------------------------------------------------------------");
      System.out.printf("Salário: R$ %.2f%n", salarioAtual);
      System.out.printf("Reajuste: %.0f%%%n", percentualReajuste);
      System.out.printf("Valor do Reajuste: R$ %.2f%n", valorReajuste);
      System.out.printf("Salário Reajustado: R$ %.2f%n", valorNovoSalario);
      System.out.println("------------------------------------------------------------");
    }     
  }
}
