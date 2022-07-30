package dio.colecoes_java.Lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExPropos2 {
    public static void main(String[] args) {
        List<String> repostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Perguntas:");
        System.out.println("\nTelefonou para a vítima?");
        String resposta = scan.next();
        repostas.add(resposta.toLowerCase());
        System.out.println("Esteve no local do crime?");
        resposta = scan.next();
        repostas.add(resposta.toLowerCase());
        System.out.println("Mora perto da vítima?");
        resposta = scan.next();
        repostas.add(resposta.toLowerCase());
        System.out.println("Tinha dívida com a vítima?");
        resposta = scan.next();
        repostas.add(resposta.toLowerCase());
        System.out.println("Já trabalhou com a vítima");
        resposta = scan.next();
        repostas.add(resposta.toLowerCase());

        System.out.println(repostas);

        int count = 0 ;
        Iterator<String> contador = repostas.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if (resp.contains("s")){
                count++;
            }
        }

        switch (count){
            case 2:
                System.out.println(">>SUSPEITA<<"); break;
            case 3:
                System.out.println(">>CÚMPLICE<<"); break;
            case 4:
                System.out.println(">>ASSASSINO<<"); break;
            default:
                System.out.println(">>INOCENTE<<"); break;

        }
    }
}
