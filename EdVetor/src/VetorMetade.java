import java.util.Scanner;

public class VetorMetade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[100];

        System.out.println("Insira um valor: ");
        double valor = scanner.nextInt();

        vetor[0] = valor;

        for(int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i - 1] / 2;
        }

        System.out.println("Vetor final: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Posição: " + i + " " + vetor[i]);
        }

    }
}
