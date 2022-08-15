package EstruturadeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        /*notas de 0 a 10
        total = soma de todas as notas
         variavel = quantidades de notas validas digitadas
        para sair = -1
        calcular a média
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular Média das Notas\nPara concluir e ver a média DIGITE -1");
        double nota = 0;
        double total = 0.0;
        int quantidade = 0;
        do{
            System.out.printf("Informe as Notas:");
            nota = scanner.nextDouble();
            if (nota >= 0.0 && nota <= 10.0) {
                total += nota;
                quantidade ++;
            }else if(nota != -1) {
                System.out.printf("Informe uma nota Válida");
            }
        }while (nota != -1);

        resultado(total, quantidade);
    }
    private static void resultado(double total, int quantidade) {
        double media = total / quantidade;
        System.out.println("Foram inseridas "+quantidade+" Notas.");
        System.out.println("A média das notas é de: "+media);
    }
}
