public class Exercicio01 {

    public static void executar(){

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
        }
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;

        Prompt.separador();
        Prompt.imprimir("Média dos números digitados: " + media);
        Prompt.separador();

        Prompt.imprimir("Valores menores que a média:");
        for (int numero : numeros) {
            if (numero < media) {
                Prompt.imprimir(numero);
            }
        }

        Prompt.linhaEmBranco();

        Prompt.imprimir("Valores iguais à média:");
        for (int numero : numeros) {
            if (numero == media) {
                Prompt.imprimir(numero);
            }
        }

        Prompt.linhaEmBranco();

        Prompt.imprimir("Valores superiores à média:");
        for (int numero : numeros) {
            if (numero > media) {
                Prompt.imprimir(numero);
            }
        }
    }
}
