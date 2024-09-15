import java.util.Scanner;

public class VetorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma1 = 0;
        int soma2 = 0;


        System.out.println("Insira 10 numeros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
            soma1 += vetor[i] * (i + 1);
            soma2 += (i + 1);
        }

        double media = (double) soma1 / soma2;

        System.out.println("A média dos valores é: " + media);

    }
}
