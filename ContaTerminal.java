import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que insira o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = Integer.parseInt(scanner.nextLine());

        // Solicita ao usuário que insira o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que insira o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Exibe a mensagem com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}