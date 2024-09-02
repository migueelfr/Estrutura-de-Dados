import java.util.Random;

public class Vetores100 {
    public static void main(String[] args) {

        Random random = new Random();
        int [] vetor1 = new int[100];
        int soma = 0;

    for (int i = 0; i < 100; i++){
        vetor1[i] = random.nextInt(101);
        soma += vetor1[i];
    }

    System.out.println("Vetor Aleatorio");
    for(int i = 0; i < 100; i++) {
        System.out.println("Posição " + i + ": " + vetor1[i]);

    }
        int menorValor = vetor1[0];
        int posiçãoMV = 0;

    for(int i = 0; i <100; i++){
        if( vetor1[i] < menorValor){

            menorValor = vetor1[i];
            posiçãoMV = i;
        }
    }
    int [] vetor2 = new int[100/2];

    for( int i = 0; i < 50; i++) {
        vetor2[i] = vetor1[i] + vetor1[100 - 1 - i];
    }

        System.out.println(" \nMenor valor: " + menorValor + " na posição " + posiçãoMV + "\n");
        System.out.println("Soma: " + soma + "\n _________________");
        System.out.println("Novo vetor:");
        for (int i = 0; i < 50; i++) {
            System.out.println("Posição " + i + ": " + vetor2[i]);
        }

    }
}
