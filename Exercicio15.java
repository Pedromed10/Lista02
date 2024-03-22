public class Exercicio15 {

    public static void executar() {

        int[] vetor = new int[5];

        vetor[0] = Prompt.lerInteiro("Digite o primeiro número:");

        for (int i = 1; i < 5; i++) {
            int numero = Prompt.lerInteiro("Digite o próximo número:");
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Tente novamente.");
                i--;
            }
        }

        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
