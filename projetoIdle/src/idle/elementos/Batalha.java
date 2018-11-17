package idle.elementos;

import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Batalha {
    public Batalha(Heroi heroi, Inimigo inimigo){
        int turno = 0; // Determina qual personagem irá atacar
        
        while(heroi.getHp() > 0 && inimigo.getHp() > 0) {
            turno = turno + 1;
            
            if(turno % 2 == 0) { // Inimigo ataca
                int dano = (inimigo.getAtaque()*inimigo.getInteligencia() + inimigo.getSorte())/heroi.getDefesa();
                heroi.setHp(heroi.getHp() - dano);
                System.out.println("Turno " + turno + ": Inimigo ataca.");
                System.out.println("Dano infligido: " + dano + ".");                
            } else { // Herói ataca
                int dano = (heroi.getAtaque()*heroi.getInteligencia() + heroi.getSorte())/inimigo.getDefesa();
                inimigo.setHp(inimigo.getHp() - dano);
                System.out.println("Turno " + turno + ": Herói ataca.");
                System.out.println("Dano infligido: " + dano + ".");
            }
            
            System.out.print("HP de " + heroi.getNome() + ": " + heroi.getHp());
            System.out.print(" - ");
            System.out.print("HP de " + inimigo.getNome() + ": " + inimigo.getHp());
            System.out.println("\n");
        }
    }
}