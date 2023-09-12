import java.util.Scanner;

public class PossibilidadeDeVoto {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

    int anoDeNascimento;
    int calculaIdade;

    System.out.println("Vamos verificar a possibilidade de voto.");
    System.out.println("------");

    System.out.print("Digite seu ano de nascimento: ");
    anoDeNascimento = user.nextInt();
    
    calculaIdade = (2023 - anoDeNascimento);

    if (calculaIdade < 16) {
      System.out.println("Proibido de votar.");
    
     } else if (calculaIdade >= 16 && calculaIdade <= 17 || calculaIdade >= 60){
      System.out.println("Seu voto é opicional.");
    } else {
      System.out.println("Seu voto é obrigatório.");
    }

    user.close();
  }
}
