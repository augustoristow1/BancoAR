import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Caue Caina";
        double saldo = 2500.00;
        String tipoDeConta = "Corrente";
        int operacao;
        int cobranca = 0;
        int pix = 0;
        String pixChave;

        Scanner valor1 = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);
        Scanner chave = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:               " + nome);
        System.out.println("Tipo de conta:      " + tipoDeConta);
        System.out.println("Saldo Inicial:      R$" + saldo);
        System.out.println("*****************************************");
        System.out.println(" ");
        System.out.println(" ");


        System.out.println("Operações: ");
        System.out.println(" ");
        System.out.println("1- Consultar saldo ");
        System.out.println("2- Enviar cobrança ");
        System.out.println("3- transferencia Pix");
        System.out.println("4- Sair ");
        System.out.println(" ");
        System.out.println("Digite a operação desejada: ");
        operacao = op.nextInt();

        if (operacao == 1){
            System.out.println("Você tem R$ " + saldo);
        } else if (operacao == 2) {
            System.out.println("Qual o valor da cobrança? ");
            cobranca = valor1.nextInt();
            System.out.println("Gerando Link de cobrança no valor de: R$ "+ cobranca);
            System.out.println("LINK IMAGINARIO TEMPORARIO");

        } else if (operacao == 3){
            System.out.println("Qual o valor que deseja transferir:");
            pix = valor2.nextInt();
            System.out.println("Valor da transferência: R$ "+ pix);
            System.out.println("Insira a chave pix destinatária: ");
            pixChave = chave.nextLine();


        }


    }
}
