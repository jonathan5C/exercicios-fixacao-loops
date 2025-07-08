import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // Escreva um programa que determine se um número é par ou ímpar.

        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Informe um número: ");
            numero = leitor.nextInt();
        } while (numero < 0);

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
        leitor.close();
    }
}
