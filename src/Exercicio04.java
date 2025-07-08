public class Exercicio04 {
    public static void main(String[] args) {
        // Escreva um programa Java que imprima os números primos entre 1 e 50 usando um
        // loop for.

        for (int numero = 1; numero <= 50; numero++) {
            boolean isPrimo = true;

            for (int outroNumero = 2; outroNumero < numero; outroNumero++){
                if (numero % outroNumero == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo){
                System.out.println(numero + " é primo.");
            }
        }
    }
}
