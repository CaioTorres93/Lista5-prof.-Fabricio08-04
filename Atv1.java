import java.util.Scanner;

public class Atv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int idadeSoma = 0;
        int contador = 0;

        System.out.println("Digite as idades (digite 0 para finalizar):");

        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade != 0) {
                idadeSoma += idade;
                contador++;
            }
        } while (idade != 0);

        if (contador > 0) {
            double media = (double) idadeSoma / contador;
            System.out.printf("A média das idades digitadas é: %.2f%n", media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }

        scanner.close();
    }
}