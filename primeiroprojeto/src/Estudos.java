import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        System.out.println("Digite o ano do filme");
        System.out.println("Digite a sua avaliacao do filme");
        String filme = leitura.nextLine();
        int anoLancamento = leitura.nextInt();
        double avaliacao = leitura.nextDouble();

        System.out.println(anoLancamento);
        System.out.println(filme);
        System.out.println(avaliacao);
    }
}
