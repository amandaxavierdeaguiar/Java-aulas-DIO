import java.util.Scanner;

public class Imoveis {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        array = frase.split("/");
        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
    }
}
