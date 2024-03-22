import java.util.Arrays;

public class Exercicio14 {

    public static void executar() {

        int[] vetor = new int[5];

        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ":");
        }

        int max = vetor[0];
        int posicaoMax = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
                posicaoMax = i;
            }
        }

        int temp = vetor[4];
        vetor[4] = max;
        vetor[posicaoMax] = temp;

        System.out.println("Vetor atualizado:");
        System.out.println(Arrays.toString(vetor));

    }
}
