package br.com.dio.calculo;


public class Principal {

    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício calculadora");
        calculadora1.soma(3, 6);
        calculadora1.subtracao(9, 1.8);
        calculadora1.multiplicacao(7, 8);
        calculadora1.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
