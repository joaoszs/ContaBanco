import java.util.Scanner;

public class ProjetoBanco 
{
       public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = 0;
        String numeroAgencia = "";
        String nomeCliente = "";
        double saldo = 500.0;

        System.out.printf ("Digite seu nome : ");
        String nome = scanner.next();

        System.out.printf ("Digite sua conta : ");
        int conta = scanner.nextInt();

        System.out.printf ("Digite sua agencia : ");
        String agencia = scanner.next();
        
        System.out.println ("Ola "+nome+" obrigado por cirar uma conta no nosso banco, sua agencia eh "+agencia+", conta "+conta+" e seu saldo "+saldo+" ja esta disponivel para saque");
    }
}
