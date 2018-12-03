package expurgobelzebobo.elementos;

import expurgobelzebobo.elementos.armas.Arma;
import expurgobelzebobo.elementos.itens.Item;
import expurgobelzebobo.elementos.trajes.Traje;
import expurgobelzebobo.personagens.Heroi;

public class Loja {
    private Arma arma;
    private Item item;
    private Traje traje;
    private Heroi heroi;

    public Loja(Arma arma, Item item, Traje traje, Heroi heroi) {
        this.arma = arma;
        this.item = item;
        this.traje = traje;
        this.heroi = heroi;
    }
    
    public void trocarArma(Arma arma){
        heroi.trocarArma(arma);
    }
 
    public void trocarTraje(Traje traje){
        heroi.trocarTraje(traje);
    }
    
    public void usarItem(Item item){
        heroi.usarItem(item);
    }

}