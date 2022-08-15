package EstruturadeControle;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DesafiosEstruturadeControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        parouimpar(scanner);
        bissexto(scanner);
        statusNota(scanner);
        numeroPrimo(scanner);
        jogoAdivinhacao(scanner);
        numerosPositivos(scanner);
        letraaLetra(scanner);
        maiorNumero(scanner);
    }

    private static void maiorNumero(Scanner scanner) {
        System.out.println("***********Maior Número***********");
        int maior = 0;
        int menor = 1000;
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o Número " + i + ":");
            int num = scanner.nextInt();
            numeros[i] = num;
        }
        //System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else {
                if (menor > numeros[i]) {
                    menor = numeros[i];
                }
            }
        }
        System.out.println("O maior número é o "+maior+".");
        System.out.println("O menor número é o "+menor+".");
    }
    /**
     * 7. Criar um programa que receba uma palavra e imprime no console letra por
     * letra.
     */
    private static void letraaLetra(Scanner scanner) {
        System.out.println("Insira a Palavra:");
        String palavra = scanner.nextLine();
        char letra;
        for (int i = 0; i < palavra.length(); i++) {
            letra = palavra.charAt(i);
            System.out.println(letra);
        }
    }
    /**
     * 6. Criar um programa que enquanto estiver recebendo números positivos,
     * imprime no console a soma dos números inseridos, caso receba um número
     * negativo, encerre o programa. Tente utilizar a estrutura do while.
     */
    private static void numerosPositivos(Scanner scanner) {
        System.out.println("*****Números positivos******");
        int numeropositivo = 0;
        int soma = 0;
        while (numeropositivo >= 0) {
            System.out.println("Insira um número:");
            soma += numeropositivo;
            numeropositivo = scanner.nextInt();
        }
        System.out.println(soma);
    }
    /**
     * 5. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
     * um número aleatório em uma variável. O Jogador tem 10 tentativas para
     * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
     * de tentativas restantes, e imprima se o número inserido é maior ou menor do
     * que o número armazenado.
     */
    private static void jogoAdivinhacao(Scanner scanner) {
        System.out.println("*****Tente Adivinha um número entre 0 - 100 ******");
        int numAdivinha = (int) (Math.random() * Math.random() * (100 - 0 + 1) + 0);
        System.out.println(numAdivinha);
        int n = 1;
        int numUser = 0;
        while (n <= 10) {
            System.out.println("Tentativa número " + n + ":");
            numUser = scanner.nextInt();
            if (numUser == numAdivinha) {
                System.out.println("Parabéns você Acertou");
                break;
            } else {
                System.out.println("Restam " + (10 - n) + " Tentativas!");
                if (numUser > numAdivinha) {
                    System.out.println("o número QUE VOCÊ inseriu é MAIOR\n");
                } else {
                    System.out.println("O número QUE VOCÊ inseriu é MENOR\n");
                }
                n++;
            }
        }
    }
    /**
     * 4. Criar um programa que receba um número e diga se ele é um número primo.
     */
    private static void numeroPrimo(Scanner scanner) {
        System.out.println("*****Verificar número primo*****");
        System.out.println("Insira o Número:");
        int num = scanner.nextInt();
        int contador = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
               contador++;
            }
        }
        if (contador == 0){
            System.out.println("O número "+ num + " é um primo" );
        }else {
            System.out.println("O número "+ num + " NÃO um primo" );

        }

    }
    /**
     * 3. Criar um programa que receba duas notas parciais, calcular a média
     * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
     * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
     * "Recuperação", caso contrário imprime no console "Reprovado".
     */
    private static void statusNota(Scanner scanner) {
        System.out.println("*****Verificar status de Aprovação*****");
        int n = 1;
        double total = 0.0;
        while (n <= 2) {
            System.out.println("Informe a nota " + n + ": ");
            double nota = scanner.nextDouble();
            total += nota;
            n++;
        }
        double media = total / (n - 1);
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media < 7.0 && media > 4.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }

    /** 2. Criar um programa informa se o ano atual é um ano bissexto; */
    private static void bissexto(Scanner scanner) {
        //o ano deve ser divisível por 4 Mas Não divisível por 100, de qualquer, o ano deve ser divisível por 400
        System.out.println("*****Verificar se o ano é Bissexto*****");
        System.out.println("Informe o ano");
        int ano = scanner.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É um ano Bissexto");
        } else {
            System.out.println("Não é um ano Bissexto!");
        }
    }
    /**
     * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
     * 10 e é par;
     */
    private static void parouimpar(Scanner scanner) {

        System.out.println("*****Verificar se o número é par ou ímpar*****");
        System.out.printf("Informe um número entre 0 e 10:");
        int num = scanner.nextInt();
        if (num > 0 && num < 10 && num % 2 == 0) {
            System.out.println("É um número par");
        } else {
            System.out.println("É um número impar");
        }
    }

}

