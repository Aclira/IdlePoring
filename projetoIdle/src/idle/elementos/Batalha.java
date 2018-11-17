package idle.elementos;

import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Batalha {
    public Batalha(Heroi heroi, Inimigo inimigo){
        int turno = 0; // Determina qual personagem irá atacar
        int dano;
        
        // Variáveis temporárias existentes apenas para complementar o sistema de batalha básico
        int tempExp = 10;
        String tempItem = "Objeto";
        
        while(heroi.getHp() > 0 && inimigo.getHp() > 0) {
            turno = turno + 1;
            
            System.out.print("Turno " + turno + ": ");
            
            if(turno % 2 == 0) { // Inimigo ataca
                System.out.println(inimigo.getNome() + " ataca."); 
                
                dano = (inimigo.getAtaque()*inimigo.getInteligencia() + inimigo.getSorte())/heroi.getDefesa();
                heroi.setHp(heroi.getHp() - dano);             
            } else { // Herói ataca
                System.out.println(heroi.getNome() + " ataca.");
                
                dano = (heroi.getAtaque()*heroi.getInteligencia() + heroi.getSorte())/inimigo.getDefesa();
                inimigo.setHp(inimigo.getHp() - dano);
            }
            
            System.out.println("Dano infligido: " + dano + ".");
            System.out.println("HP de " + heroi.getNome() + ": " + heroi.getHp() + ".");
            System.out.println("HP de " + inimigo.getNome() + ": " + inimigo.getHp() + ".\n");
        }
        
        if(heroi.getHp() > 0) {
            System.out.println(heroi.getNome() + " venceu!");
            System.out.println("Ganhou " + tempExp + " de experiência!");
            System.out.println("Encontrou " + tempItem + "!");
        } else {
            System.out.println(heroi.getNome() + " foi derrotado(a)!");
            System.out.println("Fim de jogo!");
        }
    }
}