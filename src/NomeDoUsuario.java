import java.util.Scanner;

public class NomeDoUsuario {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    
    System.out.print("Digite o seu sobrenome: ");
    String sobrenome = user.nextLine();

    System.out.print("Digite o seu nome: ");
    String nome = user.nextLine();

    String nomeCompleto = nome +" "+ sobrenome;

    int numeroDeLetras = nomeCompleto.replaceAll(" ", "").length();

    System.out.println("Seu nome completo é: " + nomeCompleto);
    System.out.println("E possui o total de " + numeroDeLetras + " letras.");

    user.close();
  }
}