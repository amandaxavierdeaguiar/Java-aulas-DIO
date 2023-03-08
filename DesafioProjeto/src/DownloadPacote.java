/*
Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para você fazer foi o contador de porcentagem de download dos pacotes. Mas como o espaço para essa informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1. Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.
 */

import java.util.Scanner;

public class DownloadPacote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantidade Downloads: ");
        int tamanho = leitor.nextInt();

        for (int i = 1; i <= tamanho && i <= 10; i++) {
            System.out.print("/");  
        }
    }
}
