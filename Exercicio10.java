public class Exercicio10 {

    public static void executar() {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        Prompt.imprimir("Digite os elementos do vetor A:");

        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro();
        }

        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        Prompt.imprimir("Vetor B com os elementos de A de forma invertida:");
        for (int i = 0; i < 5; i++) {
            Prompt.imprimir("Elemento " + i + ": " + vetorB[i]);
        }
    }
}