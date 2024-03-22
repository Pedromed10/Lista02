public class Exercicio09 {

    public static void executar() {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        Prompt.imprimir("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro();
        }

        Prompt.imprimir("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = Prompt.lerInteiro();
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }

        Prompt.imprimir("Vetor C gerado de acordo com as regras:");
        for (int i = 0; i < 5; i++) {
            Prompt.imprimir("Elemento " + i + ": " + vetorC[i]);
        }
    }
}
