package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class OperacoesStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos Elementos desta lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e por dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println); //Set - Não aceita números repetidos

        System.out.println("Transforme essa lista de String em uma Lista de Números Inteiros: ");
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que dois e coloque em uma lista: ");
        List<Integer>ListParesMaiores2 = numerosAleatorios.stream().map(Integer::parseInt).filter(t -> (t %2 == 0 && t > 2)).collect(Collectors.toList());
        System.out.println(ListParesMaiores2);

        System.out.println("Média dos Números: ");
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s)).average().ifPresent(value -> System.out.println(value));

        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(integer ->(integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
    }
}
