import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[10];

        System.out.println("Digite um valor: ");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        vetor[0] = 0;
        vetor[1] = 1;

        for(int i = 2; i< numero; i++){
            vetor[i] = vetor[i - 2] + vetor[i - 1];
            System.out.println("Posição: " + i + " " + vetor[i]);
        }
        
        System.out.println("O fibonacci do seu número é: " + vetor[numero - 1]);
       
        
        scanner.close();

    }
}
