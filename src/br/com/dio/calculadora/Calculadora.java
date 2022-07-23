package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor:");
        a= scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        double soma = soma(a,b);
        double divisao = divisao(a,b);
        double subtracao = subtracao(a,b);
        double multip = multip(a,b);

        System.out.println("Resultado da Soma:"+ soma);
        System.out.println("Resultado da Subtração:"+ subtracao);
        System.out.println("Resultado da Divisão:"+ divisao);
        System.out.println("Resultado da Multiplicação:"+ multip);
    }

    public static double soma(double a, double b) {
        return a+b;

    }

    public static double subtracao(double a, double b) {
        return a-b;
    }

    public static double divisao(double a, double b) {

        return a/b;
    }

    public static double multip(double a, double b) {
        return a*b;
    }
}
