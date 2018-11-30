package idle.src;

import idle.elementos.Batalha;

import idle.elementos.profissoes.Arqueiro;
import idle.elementos.profissoes.Guerreiro;
import idle.elementos.profissoes.Mago;

import idle.elementos.Raca;

import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Play {
    public static void main(String args[]){
	Mago mago = new Mago();
        Raca retardado = new Raca("Retardado");
        
        Heroi heroi = new Heroi("Acza", mago);
        Inimigo inimigo = new Inimigo("Andre", retardado);
        
        Batalha porrada = new Batalha(heroi, inimigo);
    }
}