package dowhileexemplos;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números.*/
public class DoWhileExemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0; int maior = 0, count = 0;

        do {
            System.out.println("Digite 5 números: ");
            int numero = input.nextInt();

            media = media + numero;

            if (numero > maior) maior = numero;
            count = count +1;

        } while (count<5);
        media  = media / 5;
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("A média é: " + media);

    }
}