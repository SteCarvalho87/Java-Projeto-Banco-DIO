import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int numeroConta;       
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá cliente! por favor, digite o numero da Agencia");
        agencia = scan.next();

        System.out.println("Agora, digite o numero da sua Conta Bancária");
        numeroConta = scan.nextInt();

        System.out.println("Digite também o seu nome completo");
        nomeCliente = scan.nextLine();

        System.out.println("Informe o saldo");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco!\nSua agência é: " + agencia + "\nConta:" + numeroConta + "\nSeu saldo de R$" + saldo + "já está disponível para saque");
        
    }
}
