package dio.colecoes_java.Lista.set;

import java.util.*;

public class ExPropSet1 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-ris");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("verde");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores do arco-iris uma abaixo da outra:");
        for (String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-iris tem:" + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabetica:");
        Set<String > coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        Set<String > coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde"
        , "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String > coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra 'v':");
        for (String cor: coresArcoIris){
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que nao começam com a letra 'v':");
        Iterator<String > iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()){
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto:");
        coresArcoIris.clear();
        System.out.println("Confira se o conjunto esta vazio:" + coresArcoIris.isEmpty());
    }
}
