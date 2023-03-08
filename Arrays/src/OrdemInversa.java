public class OrdemInversa {
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

    public static void main(String[] args) {
        //Array - elementos do mesmo tipo

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        /*Array a contagem começa no zero. A ordem dos elementos é a ordem que ele vai ficar organizado no Array */

        System.out.print("Vetor: ");

        int contador = 0;

        while (contador < (vetor.length)){
            /* -1 pois ele começa em zero. length retorna tamanho do array */
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length -1) ; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    } 
}
