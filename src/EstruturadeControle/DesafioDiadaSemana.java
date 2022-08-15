package EstruturadeControle;

import java.util.Scanner;

public class DesafioDiadaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------*Dia da SEMANA*-------");
        System.out.println("Informe o dia da semana:");
        String d = scanner.nextLine();
        String dia = d.toLowerCase().trim();

        int result = diaSemana(dia);
        System.out.println("O dia da semana é: "+result);

    }
    private static int diaSemana(String dia) {
        int result =0;
        if (dia.equals("domingo")) {
            return 1;
        } else if (dia.equals("segunda")) {
            return 2;
        }else if (dia.equals("terça")) {
            return 3;
        } else if (dia.equals("quarta")) {
            return 4;
        }else if (dia.equals("quinta")) {
            return 5;
        } else if (dia.equals("sexta")) {
            return 6;
        } else if (dia.equals("sabado")) {
            return 7;
        }else {
            System.out.println("Informe um dia da semana válido");
        }
        return result;

    }
}
