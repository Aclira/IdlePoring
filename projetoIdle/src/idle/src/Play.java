package idle.src;

import idle.elementos.Batalha;
import idle.elementos.Classe;
import idle.elementos.Raca;
import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Play {
    public static void main(String args[]){
	Classe mago = new Classe("Mago");
        Raca retardado = new Raca("Arqueiro");
        Heroi heroi = new Heroi("Acza", mago);
        Inimigo inimigo = new Inimigo("Andre", retardado);
        
        Batalha porrada = new Batalha(heroi, inimigo);
    }
}