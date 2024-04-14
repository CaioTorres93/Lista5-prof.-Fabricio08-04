import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int numberOfCities = 5; // Vamos trabalhar com 5 cidades
        String[] cityNames = new String[numberOfCities];
        int[] vehicles = new int[numberOfCities];
        int[] accidents = new int[numberOfCities];
        
        // Leitura dos dados das cidades
        for (int i = 0; i < numberOfCities; i++) {
            System.out.println("Digite o nome da cidade " + (i + 1) + ":");
            cityNames[i] = scanner.nextLine();
            
            System.out.println("Digite o número de veículos de passeio na cidade " + cityNames[i] + ":");
            vehicles[i] = scanner.nextInt();
            
            System.out.println("Digite o número de acidentes de trânsito com vítimas na cidade " + cityNames[i] + ":");
            accidents[i] = scanner.nextInt();
            
            scanner.nextLine(); // Limpar a quebra de linha restante
        }

        // Inicializa variáveis para calcular os índices de acidentes e as cidades com maior e menor índice
        double maxIndex = 0;
        double minIndex = Double.MAX_VALUE;
        String cityMaxIndex = "";
        String cityMinIndex = "";
        
        // Variável para calcular a média de veículos
        int totalVehicles = 0;

        // Calcular índices de acidentes e média de veículos
        for (int i = 0; i < numberOfCities; i++) {
            double accidentIndex = (double) accidents[i] / vehicles[i];
            
            // Atualizar maior índice
            if (accidentIndex > maxIndex) {
                maxIndex = accidentIndex;
                cityMaxIndex = cityNames[i];
            }
            
            // Atualizar menor índice
            if (accidentIndex < minIndex) {
                minIndex = accidentIndex;
                cityMinIndex = cityNames[i];
            }
            
            // Acumular total de veículos
            totalVehicles += vehicles[i];
        }
        
        // Calcular a média de veículos nas cinco cidades
        double averageVehicles = (double) totalVehicles / numberOfCities;
        
        // Exibir resultados
        System.out.println("Maior índice de acidentes de trânsito: " + maxIndex + " na cidade " + cityMaxIndex);
        System.out.println("Menor índice de acidentes de trânsito: " + minIndex + " na cidade " + cityMinIndex);
        System.out.println("Média de veículos nas cinco cidades juntas: " + averageVehicles);
        
        // Fechar o scanner
        scanner.close();
    }
}