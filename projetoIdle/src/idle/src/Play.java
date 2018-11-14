package idle.src;

import java.util.Timer;
import java.util.TimerTask;
import idle.elementos.Batalha;
import idle.elementos.Classe;
import idle.elementos.Raca;
import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Play {
    public static void main(String args[]){
	Classe mago = new Classe("Mago");
        Raca retardado = new Raca("Arqueiro");
        Heroi heroi1 = new Heroi("Acza", mago);
        Inimigo inimigo1 = new Inimigo("Andre", retardado);
        
        Batalha porrada = new Batalha(heroi1, inimigo1);
    }
}