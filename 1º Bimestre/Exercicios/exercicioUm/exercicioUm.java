import java.util.*;
import java.util.Scanner;

public class exercicioUm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "", valor = "";
        int horas = 0;
        float v, valorTotal;

        System.out.print("Informe o nome: ");
        nome = input.next();
        System.out.print("Informe a qtd de horas: ");
        horas = input.nextInt();
        System.out.print("Informe valor por horas: ");
        valor = input.next();

        v = Float.parseFloat(valor);
        valorTotal = horas * v;
        System.out.printf("Valor recebido: %f \n", valorTotal);
    }
}
