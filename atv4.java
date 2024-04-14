import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 10;
        int pessoasComPesoAcima90 = 0;
        int pessoasComIdadeEntre10e30 = 0;
        int pessoasComAlturaAcima190 = 0;
        double somaIdades = 0.0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            System.out.println("Digite o peso (em kg) da pessoa " + i + ":");
            double peso = scanner.nextDouble();

            System.out.println("Digite a altura (em metros) da pessoa " + i + ":");
            double altura = scanner.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                pessoasComPesoAcima90++;
            }

            if (idade >= 10 && idade <= 30 && altura > 1.90) {
                pessoasComIdadeEntre10e30++;
            }

            if (altura > 1.90) {
                pessoasComAlturaAcima190++;
            }
        }

        double mediaIdades = somaIdades / totalPessoas;
        double porcentagemIdadeEntre10e30 = (double) pessoasComIdadeEntre10e30 / totalPessoas * 100;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso acima de 90 kg e altura inferior a 1,50 m: " + pessoasComPesoAcima90);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e altura acima de 1,90 m: " + porcentagemIdadeEntre10e30 + "%");

        System.out.println("Programa encerrado.");
    }
}