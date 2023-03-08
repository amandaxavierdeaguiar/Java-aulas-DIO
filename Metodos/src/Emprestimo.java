/* Calcule o valor final de um empréstimo, a partir
 do valor solicitado. Taxas e parcelas influenciam.
 Defina arbitrariamente as faixas que influenciam
 nos valores
*/

public class Emprestimo {

    public static int duasParcelas() {
        return 2;
    }

    public static int tresParcelas() {

        return 3;
    }

    public static double taxaDuasParcelas() {

        return 0.3;
    }

    public static double taxaTresParcelas() {

        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * taxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * taxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}
