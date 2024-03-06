import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Jorge Matos";
        String tipoConta = "Corrente";
        double saldo = 7000.00;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("Nome do cliente:" + nome);
        System.out.println("Tipo da conta:" + tipoConta);
        System.out.println("Saldo:"+ saldo);
        System.out.println("*************************");

String menu = """
        ***Digite sua opção:***
        1- Consultar Saldo
        2- Fazer Pix
        3- Receber valor
        4- sair
        """;
        Scanner leitura = new Scanner(System.in); // ler dados do teclado
        while (opcao !=4){
        System.out.println(menu);
        opcao = leitura.nextInt();

        if(opcao == 1){
            System.out.println("Seu saldo atual é de: "+"R$"+ saldo);

        }
        else if(opcao == 2){
            System.out.println("Seu saldo atual é de: "+"R$"+ saldo + " Quanto deseja transferir?");
            double valor = leitura.nextDouble();
            if(valor>saldo){
                System.out.println("Saldo insuficiente!");

            }else{
                System.out.println("transferencia realizada");
                saldo -= valor ;
                System.out.println("Novo saldo: " + saldo);
            }
        }
        else if(opcao ==3){
            System.out.println("Seu saldo atual é de: " + saldo + " Quanto deseja receber?");
            double valor = leitura.nextDouble();
            if(valor>0){
                saldo += valor;
                System.out.println("Seu saldo atual é de: " + saldo );

            }
            else{
                System.out.println("Valor invalido!");
            }
        }
        }
    }
}
