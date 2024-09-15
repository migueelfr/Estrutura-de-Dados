import java.util.Scanner;
public class VetorPar {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 10 números: ");

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();

        }

        System.out.println("Numeros pares:");
        for( int i = 0; i < 10; i++){
            if(vetor[i] % 2 ==0){
                System.out.println( vetor[i] + " ");
            }
        }

        System.out.println("Numeros impares: ");
        for( int i = 0; i < 10; i++){
            if(vetor[i] % 2 !=0){
                System.out.println( vetor[i] + " ");
            }
        }
    }
}