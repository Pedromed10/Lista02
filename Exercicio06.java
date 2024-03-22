public class Exercicio06 {

    public static void executar() {

        double[] notas = new double[5];

        double[] pesos = new double[5];

        Prompt.imprimir("Digite as 5 notas:");
        for (int i = 0; i < 5; i++) {
            notas[i] = Prompt.lerDecimal();
        }

        Prompt.imprimir("Digite os 5 pesos:");
        for (int i = 0; i < 5; i++) {
            pesos[i] = Prompt.lerDecimal();
        }

        double somaProdutos = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaProdutos / somaPesos;

        Prompt.imprimir("A média ponderada do aluno é: " + mediaPonderada);
    }
}
