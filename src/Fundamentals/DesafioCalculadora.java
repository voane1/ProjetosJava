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
           int resultadoInt = calculadoraInt(t,q,s);
            System.out.println("O resultado é: "+ resultadoInt);
        } else{
            double resultadoDouble = calculadoraDouble(t,q,s);
            System.out.println("O resultado é: "+ resultadoDouble);
        }
    }
    private static double calculadoraDouble(String t, String q, String s) {
        double result = 0.0;
        if (s.equals("+")){
            result = Double.parseDouble(t) + Double.parseDouble(q);
        } else if (s.equals("-")) {
            result = Double.parseDouble(t) - Double.parseDouble(q);
        } else if (s.equals("/")) {
            result = Double.parseDouble(t) / Double.parseDouble(q);
        } else if (s.equals("*")) {
            result = Double.parseDouble(t) * Double.parseDouble(q);
        } else if (s.equals("%")) {
            result = Double.parseDouble(t) % Double.parseDouble(q);
        }else {
            System.out.println("Informe umas dessas operações -> (+ - / * %)");
        }

        return result;
    }
    private static int calculadoraInt(String t, String q, String s) {
        int result = 0;
        if (s.equals("+")){
            result = Integer.parseInt(t) + Integer.parseInt(q);
        } else if (s.equals("-")) {
            result = Integer.parseInt(t) - Integer.parseInt(q);
        } else if (s.equals("/")) {
            result = Integer.parseInt(t) / Integer.parseInt(q);
        } else if (s.equals("*")) {
            result = Integer.parseInt(t) * Integer.parseInt(q);
        } else if (s.equals("%")) {
            result = Integer.parseInt(t) % Integer.parseInt(q);
        }else {
            System.out.println("Informe umas dessas operações -> (+ - / * %)");
        }

        return result;
    }





}



