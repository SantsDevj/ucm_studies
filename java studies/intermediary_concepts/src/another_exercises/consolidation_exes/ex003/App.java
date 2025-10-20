package another_exercises.consolidation_exes.ex003;
import java.util.Scanner;

import another_exercises.consolidation_exes.ex003.CalculadoraEstatica.*;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num1 = read.nextInt();
        System.out.println("Insira um outro número: ");
        int num2 = read.nextInt();

        System.out.println(CalculadoraEstatica.somar(num1, num2));
    }
}
