package EstruturadeControle;

import java.util.Scanner;

public class DesafioFor {

    /*
     *
     *
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contadorpar();
        fordentrodooutro();
        versaoWhile();
        versaoFor();//sem valor numérico para controlar o laço



    }

    private static void versaoFor() {
        for (String i = "#"; !i.equals("######"); i+="#") {
            System.out.println(i);
        }
    }
    private static void versaoWhile() {
        String caracter = "#";
        while (!caracter.equals("######")){
            System.out.println(caracter);
            caracter+="#";
        }
     }
    private static void fordentrodooutro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]",i,j);
            }
            System.out.println();
        }

    }

    private static void contadorpar() {
        int par = 0;
        for (int i = 10; i >= 0; i-=2) {
            par = i;
            System.out.println(par);

        }
    }
}
