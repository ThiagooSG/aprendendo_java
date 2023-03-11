package forexemplos;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
public class ForExemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, fatorial;

        System.out.println("FATORIAL - Digite um número inteiro: ");
        numero = input.nextInt();
        fatorial = numero;
        for (int i = 1; i < numero; i++) {
            fatorial = fatorial * (numero - i);
        }
        System.out.println("O Fatorial do " + numero + " é: "
                + fatorial);
    }
}
