package arrays;

import java.util.Random;

/*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final, mostre os números e seus sucessores.*/
public class ArraysUnidimensionais3 {
    public static void main(String[] args) {

        Random aleatorios = new Random();
        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) {
            int numero = aleatorios.nextInt(100);
            numAleatorios[i] = numero;
        }
        System.out.print("\nOs antecessores dos vinte números aleatorios são: ");
        for (int numero : numAleatorios) {
            System.out.print((numero-1) + " ");
        }
        System.out.print("\nOs vinte números aleatorios são: ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nOs sucessores dos vinte números aleatorios são: ");
        for (int numero : numAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
