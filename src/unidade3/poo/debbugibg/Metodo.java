package unidade3.poo.debbugibg;

public class Metodo {
    public static void main(String[] args) {
        System.out.println("Inicio do programa no método");
        a();
        System.out.println("Finalização do programa");
    }

    static void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b(){
        System.out.println("Entrou no método b.");
        for (int i=0; i<=4;i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
