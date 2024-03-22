public class Exercicio04 {

    public static void executar() {

        int[] vetor = new int[5];
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ":");
        }

        int n = Prompt.lerInteiro("Digite o número n:");

        Prompt.imprimir("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                Prompt.imprimir(i);
            }
        }
    }
}
