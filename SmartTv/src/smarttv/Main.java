package smarttv;

import smartstatus.StatusSmart;

/*Vamos criar um exemplo de uma classe para representar uma SmartTV sem interações
  e com valores já definidos onde:
        1.	Ela tenha as características: ligada (boolean), canal (int) e volume (int)
        2.	Nossa TV poderá ligar e desligar e assim mudar o estado ligada
        3.	Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
        4.	Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente*/

public class Main {
    public static void main(String[] args) {

        StatusSmart pessoa = new StatusSmart();
        pessoa.tvDesligada();

        System.out.println("Ligando a TV");
        pessoa.ligandoTv();
        System.out.println(pessoa.tvLigada());

        System.out.println("Aumentando o volume:");
        pessoa.maisVolume();
        System.out.println("Volume atual: " + pessoa.volume);

        System.out.println("Aumetando o volume: ");
        pessoa.maisVolume();
        System.out.println("Volume atual: " + pessoa.volume);

        System.out.println("Avançando um canal: ");
        pessoa.maisCanal();
        System.out.println("Canal atual: " + pessoa.canal);

        pessoa.mudarCanal(39);
        System.out.println("Canal atual: " + pessoa.canal);

        System.out.println("Diminuindo o volume: ");
        pessoa.menosVolume();
        System.out.println("Volume atual: " + pessoa.volume);
        System.out.println("Voltando um canal: ");
        pessoa.menosCanal();
        System.out.println("Canal atual: " + pessoa.canal);

        System.out.println("Avançando um canal: ");
        pessoa.maisCanal();
        System.out.println("Canal atual: " + pessoa.canal);
        System.out.println("Diminuindo o volume e status da TV: ");
        pessoa.menosVolume();
        System.out.println(pessoa.tvLigada());

        System.out.println("Desligando a TV!");
        pessoa.tvDesligada();
    }

}