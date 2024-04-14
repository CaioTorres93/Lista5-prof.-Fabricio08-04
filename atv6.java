import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularImposto();
                    break;
                case 2:
                    calcularNovoSalario();
                    break;
                case 3:
                    classificarSalario();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void calcularImposto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double imposto;
        if (salario < 1400) {
            imposto = salario * 0.05;
        } else if (salario <= 2500) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.15;
        }

        System.out.println("Valor do imposto: R$ " + imposto);
    }

    public static void calcularNovoSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double aumento;
        if (salario > 5000) {
            aumento = 25;
        } else if (salario >= 2500) {
            aumento = 50;
        } else if (salario >= 1400) {
            aumento = 75;
        } else {
            aumento = 100;
        }

        double novoSalario = salario + aumento;
        System.out.println("Novo salário: R$ " + novoSalario);
    }

    public static void classificarSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        if (salario <= 1400) {
            System.out.println("Classificação: Mal remunerado");
        } else {
            System.out.println("Classificação: Bem remunerado");
        }
    }
}