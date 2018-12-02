package expurgobelzebobo.principal;

import expurgobelzebobo.elementos.classes.Mago;
import expurgobelzebobo.elementos.racas.Ogro;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import expurgobelzebobo.elementos.armas.Cajado;
import expurgobelzebobo.elementos.trajes.Tunica;

import expurgobelzebobo.elementos.Batalha;

public class Play {

    public static void main(String[] args) {
        
        Mago mago = new Mago();
        Ogro ogro = new Ogro();
        
        Cajado cajado = new Cajado(true);
        Tunica tunica = new Tunica(true);
        
        Heroi heroi = new Heroi(mago, cajado, tunica, "Acza");
        Inimigo inimigo = new Inimigo(ogro, true, 1);
        inimigo.setNome("José");
        
        Batalha pancadaria = new Batalha(heroi, inimigo);
    }
    
}
