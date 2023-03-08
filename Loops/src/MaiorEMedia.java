/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0; //começa do zero
        int soma = 0; //começa do zero
        int contador = 0; //começa do zero

        do {
            System.out.println("Numero: "); 
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            contador = contador + 1;
        } while(contador < 5); 

        System.out.println("O número maior: " + maior);
        System.out.println("Média: " + (soma/5));
    } 
}
