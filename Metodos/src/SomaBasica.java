/* Calcule as 4 operações básicas: soma, subtração, multiplicação 
e divisão. Sempre 2 valores devem ser passados. Utilizando métodos */

public class SomaBasica {
        
    public static void soma(double x, double y){
        double resultado = x + y;

        System.out.println("Soma: " + x + " + " + y + " = " + resultado);
    }
    public static void subtracao(double x, double y){
        double resultado = x - y;

        System.out.println("Subtração: " + x + " - " + y + " = " + resultado);
    }
    public static void multiplicacao(double x, double y){
        double resultado = x * y;

        System.out.println("Multiplicação: " + x + " x " + y + " = " + resultado);
    }
    public static void divisao(double x, double y){
        double resultado = x / y;

        System.out.println("Divisão: " + x + " / " + y + " = " + resultado);
    }
}
