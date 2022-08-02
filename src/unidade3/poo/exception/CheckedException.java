package unidade3.poo.exception;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romance-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){
            JOptionPane.showInputDialog(null, "Revise o nome do arquivo e voce deseja imprimir!" + e.getCause());
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            JOptionPane.showInputDialog(null, "Ocorreu um erro inesperado! Entre em contato como o suporte" + e.getCause());

        }finally {
            System.out.println("Chegou no finally!");
        }
        System.out.println("Apesar da exception ou nao, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line= br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
