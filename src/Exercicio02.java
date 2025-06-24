public class Exercicio02 {
    public static void main(String[] args) {
        // Escreva um programa Java que calcule a soma dos números de 1 a 100 usando um
        // loop while.

        int numero = 100;
        int contador = 1;

        int resultadoSoma = 0;
        while (numero >= contador) {
            resultadoSoma = numero + contador;
            contador++;
        }
        System.out.println("A soma é: " + resultadoSoma);

    }
}
