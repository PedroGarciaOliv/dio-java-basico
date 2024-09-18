import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);


        int numero = 0;
        String agencia = "";
        String nome = "";
        float saldo = 0.00f;

        //Exibir as mensagens para nosso usuario
        //Obter pela classe scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextFloat();

        //Exibir a mensagem final
        System.out.printf("Olá , %s%n obrigado por criar uma conta em nosso banco, sua agência é %s%n, conta %s%n e seu saldo %s%ns já está disponível para saque",nome,agencia,numero,saldo);
    }
}
