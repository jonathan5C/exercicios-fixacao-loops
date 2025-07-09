import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        // Faça um programa que verifica se um ano fornecido pelo usuário é bissexto. Se o
        // ano não termina em 00, ele é bissexto caso seja divisível por 4. Exemplos: 1988,
        // 1992, 1996, 2004, e assim por diante. Nota: Um número é divisível por 4 se a sua
        // dezena (1988 = 88) é divisível por 4.

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um ano");
        int ano = leitor.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano " + ano + " não é bissexto");
        }

        leitor.close();
    }
}
