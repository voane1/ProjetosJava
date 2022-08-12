package Fundamentals;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        System.out.println("-----------------*DesafioConversão*-----------------");
        System.out.println("Insira seus últimos 3 salários:");

        double soma = somaSalarios();
        double media = calculoMedia(soma);
        System.out.printf("A média do seu salário é "+ media);

    }
    /*
    * Método que soma os três ultimos salários inseridos pelo utilizador
    */
    public static double somaSalarios(){
        Scanner scanner = new Scanner(System.in);
        int n=0;
        double soma = 0.0;
        while (n<3){
            String a = scanner.nextLine();
            soma += Double.parseDouble(a);
            n++;
        }
        return soma;
    }
    /*
     * Método que calcula a soma dos salários inseridos pelo utilizador
     */
    public static double calculoMedia(double soma) {
        double media = soma / 3;
        return media;
    }



}
