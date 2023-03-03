import java.util.Locale;
import java.util.Scanner;

public class AjudaGoverno {
    /**
     * @param args
     * @autor Amanda Xavier
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Quantos dependentes tem?");
        int dependentes = scanner.nextInt();
        dependentes ++;

        System.out.println("Digite seu salário líquido");
        double salario = scanner.nextDouble();

        double rendaPercapita = 250.00;
        
        System.out.println("A sua renda per capita é de " + (salario/dependentes) + " euros");

        boolean recebeAuxilio = (salario/dependentes) <= rendaPercapita;

        System.out.println("Nome: " + nome + " " + sobrenome);

        if (recebeAuxilio) {
            System.out.println("Você tem o direito ao Auxílio");
        }
        else {
            System.out.println("Você não tem direito ao auxílio");
        }
    }
}
