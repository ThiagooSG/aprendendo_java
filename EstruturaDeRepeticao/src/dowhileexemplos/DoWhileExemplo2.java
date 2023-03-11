package dowhileexemplos;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros. Calcule e mostre
a quantidade de números pares e a quantidade de números impares.
*/
public class DoWhileExemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xnumeros, contador=0, contimpar=0, contpar=0;

        System.out.println("Informe a quantidade de vezes: ");
        xnumeros = input.nextInt();
        if (xnumeros != 1)
            System.out.println("Agora, digite " + xnumeros +
                " números separados pelo espaço ou enter: ");
        else
            System.out.println("Agora, digite " + xnumeros +
                    " número:");
        do {
            if (contador == xnumeros) {
                break;
            } else {
                int numero = input.nextInt();
                float e_par = numero % 2;
                if (e_par == 0){
                    contpar++;
                } else {
                    contimpar++;
                }
            }
            contador++;
        } while (true);
            if (contpar == 1 && contimpar == 1) {
                System.out.println("Foi digitado " + contpar + " número par e "
                + contimpar + " número ímpar!");
            } else if (contpar == 1 && contimpar >= 1){
                System.out.println("Foi digitado " + contpar + " número par e "
                        + contimpar + " números ímpares!");
            } else if (contpar >= 1 && contimpar == 1){
                System.out.println("Foi digitado " + contpar + " números pares e "
                        + contimpar + " número ímpar!");
            } else {
                System.out.println("Foi digitado " + contpar + " números pares e "
                        + contimpar + " números ímpares!");
            }
    }
}