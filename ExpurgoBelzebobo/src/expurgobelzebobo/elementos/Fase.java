package expurgobelzebobo.elementos;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;


public class Fase {
    
    // Lista de atributos
    
    private String nome;
    private int nivel;
    private Inimigo inimigo;
    private Heroi heroi;
    private Batalha batalha;
    private boolean liberado;
    
    public Fase(int nivel, boolean liberado, Heroi heroi, Inimigo inimigo){
        if(nivel == 1){
            this.nome = "Fase 1";
        }
        if(nivel == 2){
            this.nome = "Fase 2";
        }
        if(nivel == 3){
            this.nome = "Fase 3";
        }
        this.nivel = nivel;
        this.liberado = liberado;
        this.heroi = heroi;
        this.inimigo = inimigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getNivel(){
        return nivel;
    }

    
    
    //Loop com número de batalhas até o boss
    
    public int batalhas(int nivel){
        int nBat = nivel*5;
        for(int i = 0; i<nBat; i++){
            if(i == nBat-1){
                inimigo.setBoss(true);
                System.out.println("BOSS DA FASE "+i);
            }
            Batalha pancadaria = new Batalha(heroi, inimigo);
        }
        return 0;
    }
}
