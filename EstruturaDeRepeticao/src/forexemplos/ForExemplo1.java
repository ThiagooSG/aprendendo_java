package forexemplos;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class ForExemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, multplicacao;

        System.out.println("TABUADA - Digite um numero inteiro entre 1 a 10: ");
        numero = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            multplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multplicacao);
        }
    }
}
