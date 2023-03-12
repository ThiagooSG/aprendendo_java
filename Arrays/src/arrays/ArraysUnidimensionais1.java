package arrays;

/*Faça um Programa que leia um vetor de 6 números inteiros e mostre-os na ordem inversa.*/
public class ArraysUnidimensionais1 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};

        System.out.print("Array: ");
        int count=0;
        while (count < (numeros.length)) {
            System.out.print(numeros[count] + " ");
            count++;
        }
        System.out.print("\nArray: ");
        for (int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}