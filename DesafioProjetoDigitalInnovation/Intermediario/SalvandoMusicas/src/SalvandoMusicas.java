import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        if (arquivoDoPc.endsWith(".mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}
