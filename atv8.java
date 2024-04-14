import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número inteiro N do usuário
        System.out.println("Digite um número inteiro N:");
        int N = scanner.nextInt();

        // Verifica se N é maior ou igual a 1, pois a soma harmônica não faz sentido para N <= 0
        if (N < 1) {
            System.out.println("N deve ser um número inteiro positivo.");
            return;
        }

        // Inicializa a variável para armazenar a soma harmônica
        double H = 0;

        // Calcula a soma harmônica usando um loop for
        for (int i = 1; i <= N; i++) {
            H += 1.0 / i; // Adiciona 1/i à soma harmônica
        }

        // Exibe o resultado da soma harmônica
        System.out.println("A soma harmônica H para N = " + N + " é: " + H);
        
        // Fecha o scanner
        scanner.close();
    }
}