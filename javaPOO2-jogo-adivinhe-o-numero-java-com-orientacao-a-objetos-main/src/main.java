import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDigitado;
        int tentativas = 0;

        System.out.println("\nJogo de adivinhação :\n\nDigite um número entre 1 a 100 :");

        while (tentativas < 5) {
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (tentativas == 5) {
                System.out.println("Você perdeu, o número correto era:  " + numeroAleatorio);
                break;
            } else if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns você acertou!");
                break;
            }
            if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número é maior, tente novamente!");
            } else {
                System.out.println("O número é menor, tente novamente!");
            }
        }
    }
}

