package unidade3.poo;
import unidade3.poo.Carro;
public class rodarAplicacao {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("HB20");
        carro.setCapacidadeTanque(59);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.30));
    }
}
