import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Arbitrario {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu vetor: ");
        int tamanho = scanner.nextInt();

        int vetor[] = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetor[i] = random.nextInt(300);
        }

        Arrays.sort(vetor);
        System.out.println("Vetor gerado: " + Arrays.toString(vetor));

        System.out.println("Insira o Valor a ser buscado: ");
        int valor = scanner.nextInt();

        int Resultado = Arrays.binarySearch(vetor, valor);

        if (Resultado > 0){
            System.out.println("Valor encontrado na posição: " + Resultado);

        }else{
            System.out.println("Valor não encontrado");
        }

    }
}
