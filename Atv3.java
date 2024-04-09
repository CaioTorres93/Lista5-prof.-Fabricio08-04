import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularMediaAritmetica(scanner);
                    break;
                case 2:
                    calcularMediaPonderada(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        scanner.close();
    }

    private static void calcularMediaAritmetica(Scanner scanner) {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.printf("Média aritmética: %.2f%n", media);
    }

    private static void calcularMediaPonderada(Scanner scanner) {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.printf("Média ponderada: %.2f%n", mediaPonderada);
    }
}