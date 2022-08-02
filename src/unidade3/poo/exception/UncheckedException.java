package unidade3.poo.exception;

import javax.swing.*;
//divisao de dois valores
public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador:");
            String b = JOptionPane.showInputDialog("Denominador");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado:" + resultado);
                continueLooping = false;
            }catch (NumberFormatException e){
                e.printStackTrace();
                JOptionPane.showInputDialog(null, "Entrada invalida, informe o numero inteiro"
              +  e.getMessage());
            }catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showInputDialog(null, "Impossivel dividir um numero por 0");
            }
            finally {
                System.out.println("Chegou ao fim!");
            }
        }while (continueLooping);
        System.out.println("O codigo continua....");
    }
    public static int dividir(int a, int b){
        return a/b;
    }
}
