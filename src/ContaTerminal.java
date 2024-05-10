import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int number;
    String agency;
    String clientName;
    double balance;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.createAcount();
        conta.getAcountData();
    }

    public void createAcount() {
        System.out.println("Digite o numero da sua conta: ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        number = scanner.nextInt();
        System.out.println("Digite o numero da sua agência: ");
        agency = scanner.next();
        System.out.println("Digite o seu nome: ");
        clientName = scanner.next();
        System.out.println("Digite o seu Saldo: ");
        balance = scanner.nextDouble();
        System.out.println("Conta criada com sucesso");
    }

    public void getAcountData() {
        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque");
    }
}
