package dio.colecoes_java.Lista.streamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExStAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9","9","6","5");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("Ignore os 3 primieros elementos da lista e imprima o restante");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os numeros repetidos da lista, quantos numeros ficam?"+ countNumerosUnicos);

        System.out.println("Mostre o menor valor da lista");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("Mostre o maior valor da lista:");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        int somaDosNumerosPares;
        somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i->(i % 2 ==0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os numeros pares e some" + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem numerica:");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores impares multiplos de 3 ou de 5");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 =
                numerosAleatoriosInteger.stream()
                        .collect(Collectors.groupingBy(i -> (i%3 == 0|| i%5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
