package expurgobelzebobo.principal;

import expurgobelzebobo.elementos.classes.Mago;
import expurgobelzebobo.elementos.racas.Demonio;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import expurgobelzebobo.elementos.armas.Cajado;
import expurgobelzebobo.elementos.trajes.Tunica;

import expurgobelzebobo.elementos.Batalha;

public class Play {

    public static void main(String[] args) {
        
        Mago mago = new Mago();
        Demonio capeta = new Demonio();
        
        Cajado cajado = new Cajado(true);
        Tunica tunica = new Tunica(true);
        
        Heroi heroi = new Heroi(mago, cajado, tunica, "Acza");
        Inimigo inimigo = new Inimigo(capeta, true, 1);
        inimigo.setNome("José");
        
        Batalha pancadaria = new Batalha(heroi, inimigo);
    }
    
}
