import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
    Random sorteio = new Random();

    int numeroSelecionado;
    int numeroSorteado;

    System.out.println("Pense em um número de 1 a 5.");
    System.out.print("Digite o número: ");
    
    numeroSelecionado = user.nextInt();
    numeroSorteado = sorteio.nextInt(5) + 1;

    if(numeroSelecionado == numeroSorteado) {
      System.out.println("Você acertou! O número que pensei foi " + numeroSorteado + ".");
    } else {
      System.out.println("Você não acertou, o número que pensei foi " + numeroSorteado + ". Tente outra vez.");
    }

    user.close();
  }
}
