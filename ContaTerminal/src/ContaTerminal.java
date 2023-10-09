import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));

        //este parametro tem por finalidade adicionar uma casa decimal após o ponto para a exibição correta do valor em Reais.
        DecimalFormat formataSaldo = new DecimalFormat("0.00");


        System.out.println("Olá!! Preencha as informações solicitadas abaixo. ");

        System.out.println("Por favor, digite seu nome completo: ");
        //o parametro nextLine foi utilizado para que a variávem nomeCliente receba o nome completo do cliente
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Digite o número da conta bancária: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();
        
        //Converte o valor recebido na variável saldo e armazena em uma string saldoFormatado para exibir a mensagem impressa corretamente.
        String saldoFormatado = formataSaldo.format(saldo);

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " 
                            + numero + " e seu saldo de R$" + saldoFormatado + " já está disponível para saque.");
        
    }
}
