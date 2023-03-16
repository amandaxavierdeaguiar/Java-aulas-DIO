package Collections.src.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Notas {

/**
 * @param args
 */
public static void main(String[] args) {
    System.out.println("Crie um conjunto e adicione as notas");

    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //Nao fica na ordem o HashSet
    System.out.println(notas.toString());

    /* System.out.println("Exiba a Posição da nota 5.0: ");  Quando trabalha com Set nao consegue fazer buscas na posição. Não tem metodo get */

    /* System.out.println("Acicione na lista a nota 8.0 na posição 4: ");
     * Não consegue trabalhar com posição dentro de um Set.
    */

    /* System.out.println("Substitua a nota 5.0 pela nota 6.0"); 
     * Nao tem como fazer isso, apenas se fosse uma list
    */

    System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

    /* System.out.println("Exiba a terceira nota adicionada"); 
     * Não da para fazer pois nao tem o metodo get para passar o indice e retornar nota
    */

    System.out.println("Exiba a Menor Nota: " + Collections.min(notas));
    // Utiliza o min da classe collections

    System.out.println("Exiba a Maior nota: " + Collections.max(notas));

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0.0;
    while(iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma); // Utilizar interator

    System.out.println("Exiba a média das notas: " + (soma/  notas.size()));

    System.out.println("Remova a nota 0: ");
    notas.remove(0d);
    System.out.println(notas);

    /* System.out.println("Remova a nota na posição 0: "); Nao tem como saber posição no set */

    System.out.println("Remova as notas Menores que 7: ");
    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()){
        Double next = iterator1.next();
        if (next < 7) iterator1.remove();
    }
    System.out.println(notas);

    System.out.println("Exiba as notas na ordem em que foram informados ");
    // Se quiser saber a ordem deve utilizar a implementação o LinkedHashSet.
    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(5d);
    notas2.add(7d); //Nao imprime pois nao aceita numeros duplicados
    notas2.add(0d);
    notas2.add(3.6);
    System.out.println(notas2);

    System.out.println("Exiba todas as notas na ordem crescente: ");
    // Utilizar a implementação TreeSet pois ela organiza de acordo com a ordem natural dos elementos.
    //Double tem Comparable
    Set<Double> notas3 = new TreeSet<>(notas2); // da certo pois o nota2 é composto por double e tem o comparable.
    System.out.println(notas3);

    System.out.println("Apague todo o conjunto: ");
    notas.clear();

    System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
    System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
    } 
}
