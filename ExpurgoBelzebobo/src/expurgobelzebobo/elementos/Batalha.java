// Sistema de batalha.

package expurgobelzebobo.elementos;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import java.util.Random;

public class Batalha {
    
    // Define a experiência base que o herói pode receber ao final da batalha
    
    private final int EXP_BASE = 10;
    
    // Método que calcula a probabilidade do personagem errar o ataque
    // Chance de ocorrer: 20%
    
    private boolean fatorErro(Random gerador) {
        return (gerador.nextInt(100) + 1) < 21;
    }
    
    // Método que calcula a probabilidade do personagem efetuar um ataque crítico
    // Chance para herói/inimigo: 10%
    
    private boolean fatorCritico(Random gerador) {
        return (gerador.nextInt(100) + 1) < 11;
    }
    
    // Métodos que setam uma mensagem informando o tipo de ataque efetuado pelo personagem
    // Errado, Normal ou Crítico
    // O boss nunca erra o ataque
    
    // Versão do inimigo
    
    private String tipoAtaque(boolean boss, boolean fatorErro, boolean fatorCritico) {
        
        if(fatorErro && boss == false) {
            return "Errou!";
        } else if(fatorCritico) {
            return "Crítico!";
        } else {
            return "Normal.";
        }
    }
    
    // Versão do herói
    
    private String tipoAtaque(boolean fatorErro, boolean fatorCritico) {
        
        if(fatorErro) {
            return "Errou!";
        } else if(fatorCritico) {
            return "Crítico!";
        } else {
            return "Normal.";
        }
    }
    
    // Chama o método de ataque do inimigo e gera mensagens pertinentes ao ataque
    
    private void AtaqueInimigo(Heroi heroi, Inimigo inimigo, boolean fErro, boolean fCritico, Random gerador) {
            
        int danoInfligido = (int)inimigo.ataque(heroi, fErro, fCritico);        // Dano infligido ao herói
        int habUtilizada = inimigo.getHabUtilizada();                           // ID da habilidade utilizada
        String nomeHabilidade = inimigo.getRaca().nomeHabilidade(habUtilizada); // Nome da habilidade do inimigo
        
        try {
            Thread.sleep(gerador.nextInt(3000)); // Aguarda até 3 segundos antes de exibir as mensagens
        } catch(InterruptedException x) { }
                
        System.out.print(inimigo.getNome() + " usa " + nomeHabilidade);
        System.out.println(": " + tipoAtaque(inimigo.isBoss(), fErro, fCritico));
        System.out.println("Dano infligido: " + danoInfligido + ".");
            
        System.out.print("HP de " + heroi.getNome() + ": " + (int)heroi.getHp() + ".");
        System.out.print(" HP de " + inimigo.getNome() + ": " + (int)inimigo.getHp());
        System.out.println("\n");
    }
    
    // Chama o método de ataque do herói e gera mensagens pertinentes ao ataque
    
    private void AtaqueHeroi(Heroi heroi, Inimigo inimigo, boolean fErro, boolean fCritico, Random gerador) {
            
        int danoInfligido = (int)heroi.ataque(inimigo, fErro, fCritico); // Dano infligido ao inimigo
            
        try {
            Thread.sleep(gerador.nextInt(3000)); // Aguarda até 3 segundos antes de exibir as mensagens
        } catch(InterruptedException x) { }
            
        System.out.print(heroi.getNome() + " usa " + heroi.getArma().getNome());
        System.out.println(": " + tipoAtaque(fErro, fCritico));
        System.out.println("Dano infligido: " + danoInfligido + ".");
            
        System.out.print("HP de " + heroi.getNome() + ": " + (int)heroi.getHp() + ".");
        System.out.print(" HP de " + inimigo.getNome() + ": " + (int)inimigo.getHp());
        System.out.println("\n");
    }
    
    // Chama o método de atualização de nível do herói e exibe mensagens pertinentes ao final da batalha
    
    private void finalBatalha(Heroi heroi, int nivelFase) {
        
        if(heroi.getHp() > 0) {
                
            int nivelHeroi = heroi.getNivel();    // Armazena o nível atual do herói
            int experiencia = nivelFase*EXP_BASE; // Calcula a experiência ganha pelo herói
            heroi.atualizarNivel(experiencia);    // Atualiza o nível do herói
                
            System.out.println(heroi.getNome() + " venceu!");
            System.out.println("Ganhou " + "10" + " de experiência!");
                
            // Caso o nivel inicial do heroi seja diferente do nível atualizado, exibe uma mensagem
                
            if(heroi.getNivel() > nivelHeroi) {
                System.out.println(heroi.getNome() + "subiu para o nível " + heroi.getNivel());
            }
                
            System.out.println("Encontrou " + "Objeto" + "!");
        } else {
            
            System.out.println(heroi.getNome() + " foi derrotado(a)!");
            System.out.println("Fim de jogo!");
            
            System.exit(0); // Encerra a aplicação
        }
    }
    
    // Método principal
    
    public Batalha(Heroi heroi, Inimigo inimigo, int nivelFase) {
        
        Random gerador = new Random(); // Cria o objeto gerador para gerar números aleatórios
        
        while(heroi.getHp() > 0 && inimigo.getHp() > 0) {
            
            if(inimigo.isBoss()) {
            
                // Caso o inimigo seja um boss, ele é o primeiro a atacar
            
                AtaqueInimigo(heroi, inimigo, fatorErro(gerador), fatorCritico(gerador), gerador);
            
                if(heroi.getHp() > 0) {
                    AtaqueHeroi(heroi,inimigo, fatorErro(gerador), fatorCritico(gerador), gerador);
                }
            } else {
            
                // Caso o inimigo não seja um boss, o herói é o primeiro a atacar
            
                AtaqueHeroi(heroi, inimigo, fatorErro(gerador), fatorCritico(gerador), gerador);
            
                if(heroi.getHp() > 0) {
                    AtaqueInimigo(heroi,inimigo, fatorErro(gerador), fatorCritico(gerador), gerador);
                }
            }
        }
        
        finalBatalha(heroi, nivelFase); // Procedimento de final de batalha
    }    
}