public class Exercicio13 {

    public static void executar() {

        int n = 8;
        int[] fibonacci = gerarFibonacci(n);

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
