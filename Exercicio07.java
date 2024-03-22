public class Exercicio07 {

    public static void executar() {

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        Prompt.imprimir("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = Prompt.lerInteiro();
        }

        Prompt.imprimir("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = Prompt.lerInteiro();
        }

        boolean saoIguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            Prompt.imprimir("Os dois vetores são iguais.");
        } else {
            Prompt.imprimir("Os dois vetores não são iguais.");
        }
    }
}
