import java.text.Format;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner.
        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para o nosso usuário
        System.out.println("Olá, seja bem vindo ao banco DIO!\nInforme seus dados bancários abaixo.");

        //TODO: Obter pela classe Scanner os valores digitados no terminal

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta por favor: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por fim, digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem conta criada
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %d, conta %d e seu saldo de: %.2f já está disponível para saque.", nome, agencia, numeroConta, saldo ));

    }
}
