package whileexemplos;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso
o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
*/
public class WhileExemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = input.nextInt();

        while (true)
            if (nota < 0 || nota > 10) {
                System.out.println("NOTA INVÁLIDA - Digita uma nota entre 0 e 10: ");
                nota = input.nextInt();
            } else {
                System.out.println("Nota digita é: " + nota);
                break;
            }
    }
}
