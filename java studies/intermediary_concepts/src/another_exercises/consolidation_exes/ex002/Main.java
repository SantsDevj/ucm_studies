import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in); //Biblioteca para leitura de dados
        List<Integer> listaVendas = new ArrayList<>();

        System.out.println("Insira os valores das vendas do mês: ");
        for (int i = 0; i < 5; i++) {
            listaVendas.add(read.nextInt());
        }
        System.out.println("Lista de preços: \n" + listaVendas);
        System.out.println("Cálculo da media: ");
        System.out.println(EstatisticaVenda.calcularMedia(listaVendas));
        
    }
}
