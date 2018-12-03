// Sistema de batalha.

package expurgobelzebobo.elementos;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import expurgobelzebobo.elementos.armas.*;
import expurgobelzebobo.elementos.itens.*;
import expurgobelzebobo.elementos.trajes.*;

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
    
    // Método que gera novos objeto ao final da batalha
    
    private void drop(Heroi heroi, int nivelFase, Random gerador) {
        
        String nomeObjeto; // Armazenará o nome do objeto gerado
        
        if(heroi.bolsa.espacoDisponivel()) {
            
            // Caso a bolsa ainda tenha espaço disponível, um tipo de objeto é sorteado
        
            int sorteio = gerador.nextInt(3);
            
            switch (sorteio) {
                case 0: // O objeto sorteado é uma arma: novo sorteio para definir qual arma será gerada
                    sorteio = gerador.nextInt(3);
                    switch (sorteio) {
                        case 0: // A arma sorteada é um arco
                            Arco arma = new Arco(true);
                            heroi.bolsa.adicionarArma(arma);
                            nomeObjeto = arma.getNome();
                            break;
                        case 1: // A arma sorteada é um cajado
                            Cajado cajado = new Cajado(true);
                            heroi.bolsa.adicionarArma(cajado);
                            nomeObjeto = cajado.getNome();
                            break;
                        default: // A arma sorteada é uma espada
                            Espada espada = new Espada(true);
                            heroi.bolsa.adicionarArma(espada);
                            nomeObjeto = espada.getNome();
                            break;
                    }   break;
                case 1: // O objeto sorteado é um traje: novo sorteio para definir qual traje será gerado
                    sorteio = gerador.nextInt(3);
                    switch (sorteio) {
                        case 0:  // O traje sorteado é uma armadura
                            Armadura armadura = new Armadura(true);
                            heroi.bolsa.adicionarTraje(armadura);
                            nomeObjeto = armadura.getNome();
                            break;
                        case 1: // O traje sorteado é uma jaqueta
                            Jaqueta jaqueta = new Jaqueta(true);
                            heroi.bolsa.adicionarTraje(jaqueta);
                            nomeObjeto = jaqueta.getNome();
                            break;
                        default: // O traje sorteado é uma túnica
                            Tunica tunica = new Tunica(true);
                            heroi.bolsa.adicionarTraje(tunica);
                            nomeObjeto = tunica.getNome();
                            break;
                    }   break;
                default: // O objeto sorteado é um item: novo sorteio para definir qual item será gerado
                    sorteio = gerador.nextInt(3);
                    switch (sorteio) {
                        case 0:  // Item sorteado: adrenalina
                            Adrenalina adrenalina = new Adrenalina(nivelFase, true);
                            heroi.bolsa.adicionarItem(adrenalina);
                            nomeObjeto = adrenalina.getNome();
                            break;
                        case 1: // Item sorteado: estamina
                            Estamina estamina = new Estamina(nivelFase, true);
                            heroi.bolsa.adicionarItem(estamina);
                            nomeObjeto = estamina.getNome();
                            break;
                        default: // Item sorteado: poção
                            Pocao pocao = new Pocao(nivelFase, true);
                            heroi.bolsa.adicionarItem(pocao);
                            nomeObjeto = pocao.getNome();
                            break;
                    }   break;
            }
            
            System.out.println("Encontrou " + nomeObjeto + "!"); // Mensagem informando o objeto encontrado
        } else {
            
            // Caso não tenha espaço sobrando na bolsa, uma mensagem é exibida
            
            System.out.println("Bolsa cheia!");
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
    
    private void finalBatalha(Heroi heroi, int nivelFase, Random gerador) {
        
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
                
            drop(heroi, nivelFase, gerador);
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
        
        finalBatalha(heroi, nivelFase, gerador); // Procedimento de final de batalha
    }    
}