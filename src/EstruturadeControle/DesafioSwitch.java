package EstruturadeControle;

import java.util.Scanner;

public class DesafioSwitch {
    public static void main(String[] args) {
        //o switch sem brake
        switchsemBreak();
        switchcomBreak();
    }

    private static void switchcomBreak() {
        Scanner scanner = new Scanner(System.in);
        String conceito = "";
        System.out.println("Informe  a nota:");
        int nota = scanner.nextInt();
        switch (nota){
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito ="D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
        }
        System.out.printf("O conceito é "+conceito);


    }

    private static void switchsemBreak() {
        //quando encontrar um case executa também os debaixo
        int idade = 2;
        switch (idade){
            case 3:
                System.out.println("Sabe programar!");
            case 2:
                System.out.println("Sabe Falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");

        }
    }
}
