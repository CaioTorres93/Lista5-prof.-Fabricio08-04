import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canal;
        int totalPessoas = 0;
        int[] pessoasPorCanal = new int[14]; // Índices 4, 5, 7, 12 para os canais

        System.out.println("Digite as informações de audiência (canal e número de pessoas):");
        System.out.println("Para encerrar, digite o número do canal ZERO.");

        do {
            System.out.print("Número do canal (4, 5, 7, 12): ");
            canal = scanner.nextInt();
            if (canal != 0) {
                System.out.print("Número de pessoas assistindo: ");
                int pessoasAssistindo = scanner.nextInt();
                pessoasPorCanal[canal] += pessoasAssistindo;
                totalPessoas += pessoasAssistindo;
            }
        } while (canal != 0);

        System.out.println("\nRelatório de Audiência:");
        for (int i = 4; i <= 12; i++) {
            double percentual = (pessoasPorCanal[i] * 100.0) / totalPessoas;
            System.out.printf("Canal %d: %.2f%%\n", i, percentual);
        }

        scanner.close();
    }
}