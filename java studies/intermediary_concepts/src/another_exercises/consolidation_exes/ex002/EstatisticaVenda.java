import java.util.List;

public class EstatisticaVenda {
    
    //criando o método para calcular estatística
    public static double calcularMedia(List<Integer> vendasMensais){
        //verificando se média mensal é igual a zero
        if (vendasMensais == null) {
            return 0.0;
        } else{
            int soma = 0;
            int media = 0;
            for (int i = 0; i < vendasMensais.size(); i++) {
                soma += vendasMensais.get(i);
            }
            return (double)soma /vendasMensais.size();
        }
    }
}
