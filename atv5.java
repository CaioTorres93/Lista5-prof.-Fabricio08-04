import java.util.Scanner;
public class atv5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int respostasSim = 0;
        int respostaNao = 0;
        int mulheresSim = 0;
        int homensNao = 0;
        int totalHomens = 0;
        int entrevistados = 10;
        double porcentagemHomens;
        char[] sexo = {'M', 'M', 'F','M' , 'M' , 'F' , 'F' , 'M' , 'F' , 'F' , 'F'};
        char [] respostas = {'S' , 'S' , 'S' , 'N' , 'S' , 'N' , 'N' , 'N' , 'N' , 'S'};

        for(int i = 0; i < entrevistados; i++) {
            if (respostas[i] == 'S') {
                respostasSim++;
                if (sexo[i] == 'S') {
                    mulheresSim++;
                
                }else if (respostas[i] == 'N') {
                    respostaNao++;
                    
                    if (sexo[i] == 'N') {
                        homensNao++;
                        
                    }
                    
                }
                
            }

             porcentagemHomens = (double)homensNao/totalHomens*100;

             System.out.println(" o número de pessoas que responderam sim: "+ respostasSim);
             System.out.println("o número de pessoas que responderam não:"+ respostaNao);
             System.out.println("o número de mulheres que responderam sim: "+ mulheresSim);
             System.err.println("a percentagem de homens que responderam não, entre todos os homens analisados:"+ porcentagemHomens);

        }
    }
}