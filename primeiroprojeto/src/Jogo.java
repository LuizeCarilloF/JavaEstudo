import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);// Gera um numero entre 0 e 100
        int tentativas = 0;

        while(tentativas<5){
            System.out.print("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;
            if(numeroDigitado == numeroAleatorio){
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break;
            }
            else if(numeroDigitado<numeroAleatorio){
                System.out.println("O numero digitado é menor que o gerado");
            }else{
                System.out.println("O numero digitado é maior que o gerado");
            }

        }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroAleatorio);
        }

    }
}
