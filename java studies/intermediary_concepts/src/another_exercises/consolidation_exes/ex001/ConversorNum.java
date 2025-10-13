import java.util.Scanner;

public class ConversorNum {
    //Criando o método para conversão do número
    public static <T extends Number> double converterDouble(T valor) throws ValorInvalidoException{
        //criando mecanismológico para converter o número
        double valorconvert = 0;
        if (valor.equals(null)){
            throw new ValorInvalidoException();
        } else{
            valorconvert = valor.doubleValue();
        }
       
        return valorconvert;
    }

    public static void main(String[] args) throws ValorInvalidoException{
        System.out.println("Testando o programa:");
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um valor:");
        Integer num = read.nextInt();
        System.out.println("Valor Original:\n" + num);
        System.out.println("Valor Convertido:\n" + converterDouble(num));
    }
}
