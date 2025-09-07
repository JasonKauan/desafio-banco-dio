import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem vindo!, Deseja criar uma Conta em nosso banco?\n(s/n)");
        String resposta = scanner.nextLine();


        if (resposta.equalsIgnoreCase("s")){
            String nome = pegarNome(scanner);
            int cpf = pegarCpf(scanner);
            int numero = pegarNumero(scanner);

            Cliente cliente = new Cliente(nome, cpf, numero);
            Agencia agencia = new Agencia();
            
            System.out.println("olá!"+ "" + cliente.nome + " " + "obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " " + "seu saldo é de R$" + exibirSaldo()  );
            
        }else {
            System.out.println("Tudo Bem!, encerrando o programa...");
        }


      scanner.close();
    }

       /**
       * metodos para pegar informações
       */
    public static String pegarNome(Scanner scanner){
        System.out.println("por favor, insira o seu nome completo:\n");
        return scanner.nextLine();
    }


    public static int pegarCpf(Scanner scanner){
        System.out.println("por favor, insira o seu CPF:\n");
        int cpfCliente = scanner.nextInt();
        return cpfCliente;
    }


    public static int pegarNumero(Scanner scanner){
        System.out.println("por favor, insira o seu Número de Telefone:\n");
        int numeroCliente = scanner.nextInt();  
        return numeroCliente; 
     }

     /**metodos para exibir informações  
     * @return retorna o saldo*/

     public static double exibirSaldo(){
        double saldo = 237.48;
        return saldo;
     }
    
}