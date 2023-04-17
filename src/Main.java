import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Jogo de Adivinhação: Programa que gera um número aleatório entre 0 e 100 e pede ao usuário que tente adivinhar o número, em até 5 tentativas
        Scanner tentativa = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int numAdivinhacao = -1;
        boolean acertou = false;

        for (int count = 1; count <= 5 || numAdivinhacao == numAleatorio; count++) {
            System.out.println("Digite a sua " + count + "° tentativa:");
            numAdivinhacao = tentativa.nextInt();

            if (numAdivinhacao == numAleatorio && count < 5) {
                acertou = true;
                break;
            } else if (numAdivinhacao > numAleatorio && count < 5) {
                System.out.println("O número sorteado é menor!");
            } else if (numAdivinhacao < numAleatorio && count < 5) {
                System.out.println("O número sorteado é maior!");
            }
        }

        if (acertou) {
            System.out.println("Você acertou! O número sorteado era " + numAleatorio);
        } else {
            System.out.println("Infelizemnte você não adivinhou o número " + numAleatorio);
        }
    }
}