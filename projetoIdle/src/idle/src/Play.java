package idle.src;

import idle.elementos.Raca;
import idle.personagem.Pet;

public class Play {
    public static void main(String args[]){
	Raca mago = new Raca("Mago");
        Pet lira = new Pet("Aczinha", mago);
	System.out.println(lira);
        lira.setNivel(50);
        System.out.println(lira);
        lira.setNivel(-5);
        System.out.println(lira);
    }
}