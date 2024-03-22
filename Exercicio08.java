public class Exercicio08 {

    public static void executar() {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        int[] vetorC = new int[10];

        Prompt.imprimir("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro();
        }

        Prompt.imprimir("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = Prompt.lerInteiro();
        }

        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 5] = vetorB[i];
        }

        Prompt.imprimir("Vetor C (concatenação de A e B):");
        for (int i = 0; i < 10; i++) {
            Prompt.imprimir("Elemento " + i + ": " + vetorC[i]);
        }
    }
}
