package dio.colecoes_java.Lista.map;

import java.util.*;

public class ExPropMap1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println("Substitua a população do estado RN por: 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione" +
                "PB - 4.039.277");
        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(populacaoEstadosNE);

        System.out.println("Exiba a população do estado PE:" + populacaoEstadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem em que foram informados:");
        Map<String, Integer>  populacaoEstadosNE2 = new LinkedHashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
           put("PB", 4039277);
        }};
        System.out.println(populacaoEstadosNE2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética:");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
        System.out.println(populacaoEstadosNE3);

        Collection<Integer> populacao = populacaoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()){
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.println("Exiba o estado com a menor população (%s) e seu respectivo valor (%d)\n "+
                estadoMenorPopulacao + Collections.min(populacao));
        System.out.println("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n " +
                estadoMaiorPopulacao + Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados:" + soma);

        System.out.println("Exiba a média da população deste dicionário de estados:" + (soma / populacaoEstadosNE.size()));
        System.out.println("Remova os estados com a população menor que 4.000.000:");

        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("Apague o dicionário de estados com suas respectivas populações estimadas:");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se a lista está vazia:" + populacaoEstadosNE.isEmpty());
    }
}
