package expurgobelzebobo.principal;

import expurgobelzebobo.elementos.classes.Mago;
import expurgobelzebobo.elementos.racas.Ogro;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import expurgobelzebobo.elementos.armas.Cajado;
import expurgobelzebobo.elementos.trajes.Tunica;

import expurgobelzebobo.elementos.Batalha;
import expurgobelzebobo.elementos.Fase;

public class Play {

    public static void main(String[] args) { 
        Mago mago = new Mago();
        Ogro shrek = new Ogro();
        
        Cajado cajado = new Cajado(true);
        Tunica tunica = new Tunica(true);
        
        Heroi heroi = new Heroi(mago, cajado, tunica, "Acza");
        Inimigo inimigo = new Inimigo(shrek, false, 1);
        inimigo.setNome("José");
        int nivel = 1;
        
        while(nivel<4){
            while(heroi.getHp() > 0 && inimigo.getHp() > 0) {
                Fase fase = new Fase(nivel,true, heroi, inimigo);
                System.out.println(fase.getNome());        
                fase.batalhas(nivel);
            
                if(heroi.getHp() > 0 && inimigo.getHp() == 0){
                    System.out.println("HEROI PASSOU DE FASE");
                    nivel++;
                    heroi.setHp(nivel*100);
                    inimigo.setHp(nivel*100);
                }
            }
        }
    }    
}