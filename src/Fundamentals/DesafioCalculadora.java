package Fundamentals;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler dois numeros, qual a operaçao que o utilizador quer fazer.
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------*Calculadora*-------");
        System.out.println("Informe o primeiro número:");
        String t = scanner.nextLine();
        System.out.println("Informe o segundo número:");
        String q = scanner.nextLine();
        System.out.println("Qual operação pretende fazer? (+ - / * %)");
        String s = scanner.nextLine();


        if (t.matches("[0-9]*") && q.matches("[0-9]*") ){

            double resultadoInt = calculadora(t,q,s);
            System.out.printf("O resultado de "+t+" "+s+" "+q+" = %.0f", resultadoInt);
        } else{
            double resultadoDouble = calculadora(t,q,s);
            System.out.println("O resultado de "+t+" "+s+" "+q+" = "+resultadoDouble);
        }
    }
    private static double calculadora(String num1, String num2, String s) {
        double t = Double.parseDouble(num1);
        double q = Double.parseDouble(num2);
        double result = "+".equals(s) ? t + q : 0;
        result = "-".equals(s) ? t - q : result;
        result = "*".equals(s) ? t * q : result;
        result = "/".equals(s) ? t / q : result;
        result = "%".equals(s) ? t % q : result;
        return result;
    }




}



