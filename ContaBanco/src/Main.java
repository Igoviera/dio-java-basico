import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência !");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência !");
        contaTerminal.agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        contaTerminal.nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo!");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ contaTerminal.agencia +", conta "+ contaTerminal.numero +" e seu saldo R$ "+contaTerminal.saldo +" já está disponível para saque");

    }
}