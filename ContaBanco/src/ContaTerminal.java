import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta: ");
        int numCont = sc.nextInt();
        System.out.println("Por favor, digite o numero da Agência: ");
        String numAg = sc.next();
        System.out.println("Por favor, Digite o seu nome: ");
        String nomCliente = sc.next();
        System.out.println("Por favor, Digite o seu Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque!", nomCliente, numAg, numCont, saldo);


        sc.close();
    }
}
