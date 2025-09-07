import java.util.Random;

public class Agencia {
    public static String gerarAgencia(){
        Random random = new Random();
        int numero = 1000 + random.nextInt(9000);
        int digito = numero % 10;
        return numero + "-" + digito;
    }
}
