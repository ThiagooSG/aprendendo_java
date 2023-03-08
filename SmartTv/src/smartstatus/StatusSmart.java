package smartstatus;

public class StatusSmart {
    boolean ligada;
    public int canal = 1;
    public int volume = 25;

    public boolean tvDesligada() {
        System.out.println("A TV está desligada!");
        ligada = false;
        return ligada;
    }
    public boolean ligandoTv() {
        System.out.println("A TV está ligada!");
        ligada = true;
        return ligada;
    }
    public String tvLigada() {
        return "A Tv está ligada? " + ligada+","
                + " Canal atual = " + canal+","
                + " volume atual = " + volume;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public int maisCanal() {
        canal++;
        return canal;
    }

    public int menosCanal() {
        canal--;
        return canal;
    }

    public int maisVolume() {
        volume++;
        return volume;
    }

    public int menosVolume() {
        volume--;
        return volume;
    }

}
