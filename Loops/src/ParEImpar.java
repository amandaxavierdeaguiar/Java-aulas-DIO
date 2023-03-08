/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Quantidade de números");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;

        do{ 
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantidadePares++; /*
            % significa resto. Se o numero for dividido por 2 o resto dar 0, o numero é par.
            */ 
            else quantidadeImpares++;

            contador++; //para nao ficar em loop infinito
        } while(contador < quantidadeNumeros);

        System.out.println("Quantidade de Par " + quantidadePares);
        System.out.println("Quantidade de Impar " + quantidadeImpares);

    }
    
}
