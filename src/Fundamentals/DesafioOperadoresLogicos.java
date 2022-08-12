package Fundamentals;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Trabalho na terça e na quinta pode ser v ou f, se os dois forem true = compra tv50, se um so der certo= compra tv32, e se compra tanto a
        //tv de 50 ou a 32 vcs irão ao shoping tomar sorvete
        //nao havendo trabalho terça ou quinta vao ficar em casa
        System.out.println("O trabalho de Terça foi feito? (sim/nao)");
        String t = scanner.nextLine();
        String terca = t.toLowerCase().trim();
        System.out.println("O trabalho de Quinta foi feito?");
        String q = scanner.nextLine();
        String quinta = q.toLowerCase().trim();

        if (terca.equals("sim") && quinta.equals("sim")){
            System.out.println("Vamos ao Shopping Comprar uma Tv de 50 e Compra Sorvete");
        } else if (terca.equals("sim") && quinta.equals("nao")||terca.equals("nao") && quinta.equals("sim")) {
            System.out.println("Vamos ao Shopping comprar uma Tv de 32 e comprar sorvete");
        }else {
            System.out.println("Não vamos a lado algum, ficamos em casa :(");

        }

    }
}
