import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        double[] MediaVetor = new double[10];

        System.out.println("Digite valores");
        for (int i = 0; i < 10; i++){
            System.out.println("Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();

        }

        System.out.println("Digite valores vetor 2");
        for (int i = 0; i < 10; i++){
            System.out.println("Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();

        }
        for(int i = 0; i <10; i++){
            MediaVetor[i] = vetor1[i] + vetor2[i] / 2.0;
        }

        System.out.println("Media dos Vetores");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + MediaVetor[i]);
        }

        scanner.close();

    }
}