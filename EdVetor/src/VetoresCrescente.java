import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class VetoresCrescente {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor1 = new int[100];


        for (int i = 0; i < 100; i++) {
            vetor1[i] = random.nextInt(101);
        }

        System.out.println("Vetor Aleatorio");
        for (int i = 0; i < 100; i++) {
            System.out.println("Posição " + i + ": " + vetor1[i]);

        }

        int vetor[] = new int[100];
        for(int i = 0; i < 100; i++){
            vetor[i] = 100 - 1;
            System.out.println("\nPosição " + i + ": " + vetor[i]);
        }


    }
}
//Não consegui fazer esse