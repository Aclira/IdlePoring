// Sistema de batalha.

package expurgobelzebobo.elementos;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import java.util.Random;

public class Batalha {
    
    private class AtaqueInimigo {
        
        private AtaqueInimigo(Heroi heroi, Inimigo inimigo, boolean fErro, boolean fCritico, Random gerador) {
            
            int danoInfligido = (int)inimigo.ataque(heroi, fErro, fCritico); // Dano infligido ao herói
            
            // Seta uma mensagem informando o tipo de ataque
            
            String mensagemAtaque;
            
            if(fErro && inimigo.isBoss() == false) {
                mensagemAtaque = "Errou!";
            } else if(fCritico) {
                mensagemAtaque = "Crítico!";
            } else {
                mensagemAtaque = "Normal";
            }
            
            // Aguarda um período de até 3 segundos antes de exibir as mensagens
            
            try {
                Thread.sleep(gerador.nextInt(3000));
            } catch(InterruptedException x) { }
            
            // Mensagens relativas ao ataque
            
            System.out.print(inimigo.getNome() + " usa " + inimigo.getRaca().getNomeHabilidade());
            System.out.println(": " + mensagemAtaque);
            System.out.println("Dano infligido: " + danoInfligido + ".");
            
            System.out.print("HP de " + heroi.getNome() + ": " + (int)heroi.getHp() + ".");
            System.out.print(" HP de " + inimigo.getNome() + ": " + (int)inimigo.getHp());
            System.out.println("\n");
        }
    }
    
    private class AtaqueHeroi {
        
        private AtaqueHeroi(Heroi heroi, Inimigo inimigo, boolean fErro, boolean fCritico, Random gerador) {
            
            int danoInfligido = (int)heroi.ataque(inimigo, fErro, fCritico); // Dano infligido ao inimigo
            
            // Seta uma mensagem informando o tipo de ataque
            
            String mensagemAtaque;
            
            if(fErro) {
                mensagemAtaque = "Errou!";
            } else if(fCritico) {
                mensagemAtaque = "Crítico!";
            } else {
                mensagemAtaque = "Normal";
            }
            
            // Aguarda um período de até 3 segundos antes de exibir as mensagens
            
            try {
                Thread.sleep(gerador.nextInt(3000));
            } catch(InterruptedException x) { }
            
            System.out.print(heroi.getNome() + " usa " + heroi.getArma().getNome());
            System.out.println(": " + mensagemAtaque);
            System.out.println("Dano infligido: " + danoInfligido + ".");
            
            System.out.print("HP de " + heroi.getNome() + ": " + (int)heroi.getHp() + ".");
            System.out.print(" HP de " + inimigo.getNome() + ": " + (int)inimigo.getHp());
            System.out.println("\n");
        }
    }
    
    public Batalha(Heroi heroi, Inimigo inimigo) {
        
        Random gerador = new Random(); // Cria o objeto gerador para gerar números aleatórios
        
        // Variáveis auxiliares para armazenar os fatores de erro de de ataque crítico
        
        boolean fatorErro;
        boolean fatorCritico;
        
        // Exibe mensagens relativas ao ataque
        
        if(inimigo.isBoss()) {
            
            fatorErro = gerador.nextBoolean(); // Calcula o fator de erro do inimigo
            fatorCritico = gerador.nextBoolean(); // Calcula o fator de crítico do inimigo
            AtaqueInimigo ataqueInimigo = new AtaqueInimigo(heroi, inimigo, fatorErro, fatorCritico, gerador);
            
            if(heroi.getHp() > 0) {
                
                fatorErro = gerador.nextBoolean(); // Calcula o fator de erro do herói
                fatorCritico = gerador.nextBoolean(); // Calcula o fator de crítico do herói
                AtaqueHeroi ataqueHeroi = new AtaqueHeroi(heroi,inimigo, fatorErro, fatorCritico, gerador);
            }
        } else {
            
            fatorErro = gerador.nextBoolean(); // Calcula o fator de erro do herói
            fatorCritico = gerador.nextBoolean(); // Calcula o fator de crítico do herói
            AtaqueHeroi ataqueHeroi = new AtaqueHeroi(heroi, inimigo, fatorErro, fatorCritico, gerador);
            
            if(heroi.getHp() > 0) {
                
                fatorErro = gerador.nextBoolean(); // Calcula o fator de erro do inimigo
                fatorCritico = gerador.nextBoolean(); // Calcula o fator de crítico do inimigo
                AtaqueInimigo ataqueInimigo = new AtaqueInimigo(heroi,inimigo, fatorErro, fatorCritico, gerador);
            }
        }
        
        // Exibe mensagens relativas ao resultado da batalha, quando necessário
        
        if(heroi.getHp() == 0.0 || inimigo.getHp() == 0.0) {
            
            if(heroi.getHp() > 0) {
                System.out.println(heroi.getNome() + " venceu!");
                System.out.println("Ganhou " + "10" + " de experiência!");
                System.out.println("Encontrou " + "Objeto" + "!");
            } else {
                System.out.println(heroi.getNome() + " foi derrotado(a)!");
                System.out.println("Fim de jogo!");
            }
        }
    }    
}