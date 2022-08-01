package unidade3.poo.heranca;

public class Calculadora implements OperacaoMat{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma:" +(operando1 + operando2));
    }

    @Override
    public void sub(double operando1, double operando2) {
        System.out.println("Subtração:" + (operando1 - operando2));
    }

    @Override
    public void mult(double operando1, double operando2) {
        System.out.println("Multiplicação:" + (operando1 * operando2));
    }

    @Override
    public void div(double operando1, double operando2) {
        System.out.println("Divisão:" + (operando1 / operando2));
    }
}
