import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class exercicioTres{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int aleatorio = gerador.nextInt();

        int op = 3, tentativa;
        while (op != 0){
            System.out.print("Digite um número\n");
            tentativa = input.nextInt();

            if (tentativa == aleatorio) {
                System.out.print("Parabéns, vocẽ acertou!\n");
                op = 0;
            } else {
                --op;
                if (op == 0){
                    System.out.println("Acabaram suas chances, loooser!\n");
                } else {
                    System.out.printf("Você errou, só lalá, restam %d chances \n", op);
                }
            }
        }
    }
}
