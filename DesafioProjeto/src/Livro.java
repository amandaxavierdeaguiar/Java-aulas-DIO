/* Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.
*/
import java.util.Scanner;

public class Livro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas paginas tem o livro?");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
               
        System.out.print(paginas/paginasLidas + " dias");
    }
}
