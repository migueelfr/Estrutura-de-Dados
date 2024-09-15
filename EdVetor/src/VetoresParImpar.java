import java.util.Scanner;
public class VetoresParImpar {
    public static void main(String[] args) {
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int contarPares = 0, contarImpares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 10 números: ");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                if (contarPares < 5) {
                    vetorPar[contarPares++] = numero;
                }

                }else{
                if (contarImpares < 5) {
                    vetorImpar[contarImpares++] = numero;
                }
            }
        }

        System.out.println("Numeros pares:");
        for( int i = 0; i < contarPares; i++){
            System.out.println( vetorPar[i] + " ");
        }

        System.out.println("Numeros impares: ");
        for (int i = 0; i < contarImpares; i++){
            System.out.println(vetorImpar[i] + " ");
        }
    }
}
