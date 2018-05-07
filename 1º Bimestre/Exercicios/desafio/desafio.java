import java.util.*;
import java.util.Scanner;

public class desafio{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        String converte = "";
        System.out.println("Informe o valor para conversão");
        num = input.nextInt();

        while (num !=0) {
            converte += num%2;
            num /= 2;
        }
        StringBuffer Conv = new StringBuffer(converte);
        System.out.println(Conv.reverse());
    }
}
