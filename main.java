import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Caue Caina";
        double saldo = 2500.00;
        String tipoDeConta = "Corrente";
        int operacao;
        double deposito = 0;
        double pix = 0;
        String pixChave;
        boolean sair = false;

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
        System.out.println("2- Fazer deposito ");
        System.out.println("3- transferencia Pix");
        System.out.println("4- Sair ");
        System.out.println(" ");
        System.out.println("Digite a operação desejada: ");
        operacao = op.nextInt();

        if (operacao == 1){
            System.out.println("Você tem R$ " + saldo);

        } else if (operacao == 2) {
            System.out.println("Qual o valor do depósito? ");
            deposito = valor1.nextDouble();
            System.out.println("Gerando boleto de deposito no valor de: R$ "+ deposito);
            System.out.println(" ");
            System.out.println("BOLETO IMAGINARIO");
            System.out.println(" ");
            saldo = saldo + deposito;
            System.out.println("Valor de saldo atulizado para: " + saldo);


        } else if (operacao == 3) {
            System.out.println("Qual o valor que deseja transferir:");
            pix = valor2.nextDouble();
        } else if (pix > saldo) {
            System.out.println("Você não tem saldo disponivel para essa operação");
        } else {
            System.out.println("Valor da transferência: R$ "+ pix);
            System.out.println("Insira a chave pix destinatária: ");
            pixChave = chave.nextLine();
            System.out.println("Confirme a chave: " + pixChave);

        } if ( operacao == 4){
            System.out.println("Deseja mesmo sair do sistema? (s ou n) ");
            sair = op.nextBoolean();


        }


    }
}
