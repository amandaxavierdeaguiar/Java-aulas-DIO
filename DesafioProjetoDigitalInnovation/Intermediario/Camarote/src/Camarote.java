import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        if (tamanhoDaFila % 2 == 0) {
            System.out.println(tamanhoDaFila / 2 + " pessoas no camarote");
        } else {
            System.out.println(((tamanhoDaFila / 2) + 1) + " pessoas no camarote");
        }
    }
}
