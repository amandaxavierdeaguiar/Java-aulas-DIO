public class NomeCompleto {
    public static void main(String[] args) {
        String primeiroNome = "Amanda";
        String segundoNome = "Xavier";
        String terceiroNome = "Aguiar";

        String nomeApelido = nomeApelido (primeiroNome, segundoNome, terceiroNome);

        System.out.println(nomeApelido);
    }
    public static String nomeApelido (String primeiroNome, String segundoNome, String terceiroNome){
    return "Meu nome completo é: " + primeiroNome + " " + segundoNome + " " + terceiroNome;
    }
}
