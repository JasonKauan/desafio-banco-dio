import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem vindo!, Deseja criar uma Conta em nosso banco?\n(s/n)");
        String resposta = scanner.nextLine();


        if (resposta.equalsIgnoreCase("s")){
            pegarNome(scanner);
            pegarCpf(scanner);
            pegarNumero(scanner);
            
        }


      /**
       * metodos para pegar informações
       */
    }
    public static void pegarNome(Scanner scanner){
        System.out.println("por favor, insira o seu nome completo:\n");
        String nomeCliente = scanner.nextLine();
        System.out.println(nomeCliente);
    }
    public static void pegarCpf(Scanner scanner){
        System.out.println("por favor, insira o seu CPF:\n");
        int cpfCliente = scanner.nextInt();
        System.out.println(cpfCliente);
    }
    public static void pegarNumero(Scanner scanner){
        System.out.println("por favor, insira o seu Número de Telefone:\n");
        int numeroCliente = scanner.nextInt();
        System.out.println(numeroCliente);    
     }
    
}