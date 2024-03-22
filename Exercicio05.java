public class Exercicio05 {

    public static void executar() {

        int[] vetor = new int[5];

        Prompt.imprimir("Digite os 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro();
        }

        int n = Prompt.lerInteiro("Digite o número n:");

        int quantidade = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                quantidade++;
            }
        }

        Prompt.imprimir("O número " + n + " aparece " + quantidade + " vezes no vetor.");
    }
}