import java.util.Scanner;

public class VetorPrimeiraPosição {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 1 valor: ");
        int valor = scanner.nextInt();

        vetor[0] = valor;

        for(int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i - 1] * 2;
        }

        System.out.println("Vetor final: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Posição: " + i + " " + vetor[i]);
        }

    }
}
