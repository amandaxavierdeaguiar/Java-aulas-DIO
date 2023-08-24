import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes = ingredientes.split(";");

        System.out.println(listaIngredientes[0] + "\n" + listaIngredientes[1] + "\n" + listaIngredientes[2] + "\n" + listaIngredientes[0]);
        
    }
}
