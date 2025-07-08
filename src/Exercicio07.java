

public class Exercicio07 {
    public static void main(String[] args) {
        // Escreva um programa Java que verifique se um número é um número perfeito. Um
        // número perfeito é aquele que é igual à soma de seus divisores próprios (excluindo
        // ele mesmo). Por exemplo, o número 28 é, pois: 28 = 1+2+4+7+14

        int escolha = 25;
        int soma = 0;

        for (int numero = 1; numero < escolha; numero++) {

            if (escolha % numero == 0) {
                soma += numero;
            }
        }

        if (soma == escolha) {
            System.out.println("É perfeito");
        } else {
            System.out.println("Não é perfeito");
        }
    }
}
