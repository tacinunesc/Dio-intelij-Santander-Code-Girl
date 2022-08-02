package unidade3.poo.debbugibg;

import java.util.Scanner;
public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos ={"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);
        System.out.println("Media da turma &.1f"+ media);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for (String aluno : alunos){
            System.out.println("Nota do aluno %s:"+ aluno);
            double nota = scanner.nextDouble();
            soma += nota;

        }
        return soma/alunos.length;
    }
}
