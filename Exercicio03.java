public class Exercicio03 {

    public static void executar() {

        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor:");

        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];

        Prompt.imprimir("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = Prompt.lerInteiro("Digite o número na posição " + i + ":");
        }

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        Prompt.imprimir("Valores do segundo vetor (dobro dos números do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir("Posição " + i + ": " + vetorDobro[i]);
        }
    }

}
