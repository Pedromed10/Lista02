public class Exercicio02 {

    public static void executar() {

        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor:");

        int[] vetor = new int[tamanho];

        Prompt.imprimir("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número na posição " + i + ":");
        }

        Prompt.separador();
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir("Número na posição " + i + ": " + vetor[i]);
            if (vetor[i] > 0) {
                Prompt.imprimir(" - Positivo");
            } else if (vetor[i] < 0) {
                Prompt.imprimir(" - Negativo");
            } else {
                Prompt.imprimir(" - Zero");
            }
        }
    }
}
