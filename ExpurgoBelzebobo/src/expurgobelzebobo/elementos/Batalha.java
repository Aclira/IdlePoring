// Sistema de batalha.

package expurgobelzebobo.elementos;

import expurgobelzebobo.personagens.Heroi;
import expurgobelzebobo.personagens.Inimigo;

import java.util.Random;

public class Batalha {
    
    public Batalha(Heroi heroi, Inimigo inimigo) {
        
        // Objeto para gerar numeros aleatórios entre 0 e 2
        
        Random gerador = new Random();
        
        // Variáveis auxiliares do sistema de batalha
        
        int proximoAtaque;     // Determina o personagem que irá atacar
        int ataqueCritico;     // Recebe o multiplicador do ataque: 0 = errado, 1 = normal, 2 = crítico
        double dano;           // Recebe temporariamente o dano infligido
        double defesa;         // Recebe a defesa do personagem após o cálculo do bônus/prejuízo por atributo
        String mensagemAtaque; // Recebe a mensagem exibida sobre o ataque, determinada pelo fatorCritico
        
        // Variáveis auxiliares para receber a resistência e a fraqueza do herói
        
        String resistenciaHeroi = heroi.getClasse().getResistencia();
        String fraquezaHeroi = heroi.getClasse().getFraqueza();
        
        // Variáveis auxiliares para receber a resistência e a fraqueza do inimigo
        
        String resistenciaInimigo = inimigo.getRaca().getResistencia();
        String fraquezaInimigo = inimigo.getRaca().getFraqueza();
        
        // Variáveis auxiliares para receber os atributos da arma e do traje do herói e da habilidade do inimigo
        
        String atributoArma = heroi.getArma().getAtributo();
        String atributoTraje = heroi.getTraje().getAtributo();
        String atributoHabilidade = inimigo.getRaca().gerAtributo();                    
        
        // Determina qual personagem irá atacar primeiro
        
        if(inimigo.getBoss() == true) {
            proximoAtaque = 0;
        } else {
            proximoAtaque = 1;
        }
        
        // Executa a batalha
        
        while(heroi.getHp() > 0 && inimigo.getHp() > 0) {
            
            // Ataque do inimigo
            
            if(proximoAtaque == 0 && inimigo.getHp() > 0) {
                
                // Variáveis auxiliares: determinam a chance de ataque crítico e a correção do dano gerado
                
                int fcritico = gerador.nextInt(100) + 1; // gera números aleatórios entre 1 e 100
                int correcao = gerador.nextInt(5) + 1;   // Gera números aleatórios entre 1 e 10
                
                // Calcula o fator crítico
            
                if(fcritico == 1) {
                    ataqueCritico = 2; // Ataque crítico: 1% de chance de acontecer
                } else {
                    if(fcritico > 1 && fcritico < 21) {
                        ataqueCritico = 0; // Ataque errado: 19% de chance de acontecer
                    } else {
                        ataqueCritico = 1; // Ataque normal: 80% de chance de acontecer
                    }
                }
                
                // Seta a mensagem apropriada para o tipo de ataque
                
                if(ataqueCritico == 0) {
                    mensagemAtaque = "Errou!";
                } else {
                    if(ataqueCritico == 1) {
                        mensagemAtaque = "Normal.";
                    } else {
                        mensagemAtaque = "Crítico!";
                    }
                }
                
                // Calcula o fator de alteração na defesa do herói
                
                if(atributoHabilidade.equals(resistenciaHeroi) || atributoHabilidade.equals(atributoTraje)) {
                    /* O herói é resistente a habilidade do inimigo ou possui um traje que concede
                     * essa resistência: bônus de 10% na defesa */
                    defesa = heroi.getDefesa() + 0.1*heroi.getDefesa();
                } else {
                    if(atributoHabilidade.equals(fraquezaHeroi) || atributoHabilidade.equals("geral")) {
                        /* O herói é vulnerável a habilidade do inimigo ou o inimigo possui uma
                         * habilidade forte contra qualquer tipo de defesa: prejuízo de 10% na
                         * defesa */
                        defesa = heroi.getDefesa() - 0.1*heroi.getDefesa();
                     } else {
                        // O herói é indiferente a habilidade do inimigo: nada acontece
                        defesa = heroi.getDefesa();
                    }
                }
                
                // Calcula o dano recebido e seta o novo hp do herói
                
                dano = ((inimigo.getAtaque()*inimigo.getInteligencia()/defesa) + correcao)*ataqueCritico;
                heroi.setHp(heroi.getHp() - (int)dano);
                
                // Informa o nome do atacante, o dano infligido e o hp dos personagens
                
                System.out.println(inimigo.getNome() + " ataca: " + mensagemAtaque);
                System.out.println("Dano infligido: " + (int)dano + ".");
                System.out.println("HP de " + heroi.getNome() + ": " + heroi.getHp() + ".");
                System.out.println("HP de " + inimigo.getNome() + ": " + inimigo.getHp() + ".\n");
                
                proximoAtaque = 1; // Na próxima iteração, será a vez do herói atacar
            }
            
            // Ataque do herói
            
            if(proximoAtaque == 1 && heroi.getHp() > 0) {
                
                // Variáveis auxiliares: determinam a chance de ataque crítico e a correção do dano gerado
                
                int fcritico = gerador.nextInt(100) + 1; // gera números aleatórios entre 1 e 100
                int correcao = gerador.nextInt(5) + 1;   // Gera números aleatórios entre 1 e 5
                
                // Calcula o fator crítico
            
                if(fcritico == 1) {
                    ataqueCritico = 2; // Ataque crítico: 1% de chance de acontecer
                } else {
                    if(fcritico > 1 && fcritico < 21) {
                        ataqueCritico = 0; // Ataque errado: 19% de chance de acontecer
                    } else {
                        ataqueCritico = 1; // Ataque normal: 80% de chance de acontecer
                    }
                }
                
                // Seta a mensagem apropriada para o tipo de ataque
                
                if(ataqueCritico == 0) {
                    mensagemAtaque = "Errou!";
                } else {
                    if(ataqueCritico == 1) {
                        mensagemAtaque = "Normal.";
                    } else {
                        mensagemAtaque = "Crítico!";
                    }
                }
                
                // Calcula o fator de alteração na defesa do inimigo
                
                if(atributoArma.equals(resistenciaInimigo) || resistenciaInimigo.equals("geral")) {
                    /* O inimigo é resistente a arma do herói ou possui resistência a qualquer
                     * tipo de arma: bônus de 10% na defesa */
                    defesa = inimigo.getDefesa() + 0.1*inimigo.getDefesa();
                } else {
                    if(!atributoArma.equals(fraquezaInimigo) || fraquezaInimigo.equals("nenhum")) {
                        /* O inimigo é indiferente a arma do herói ou não possui fraqueza a
                         * nenhum tipo de arma: nada acontece */
                        defesa = inimigo.getDefesa();
                     } else {
                        // O inimigo é vulnerável a arma do herói: prejuízo de 10% na defesa
                        defesa = inimigo.getDefesa()- 0.1*inimigo.getDefesa();
                    }
                }
                
                // Calcula o dano recebido e seta o novo hp do inimigo
                
                dano = ((heroi.getAtaque()*heroi.getInteligencia()/defesa) + correcao)*ataqueCritico;
                inimigo.setHp(inimigo.getHp() - (int)dano);
                
                // Informa o nome do atacante, o dano infligido e o hp dos personagens
                
                System.out.println(heroi.getNome() + " ataca: " + mensagemAtaque);
                System.out.println("Dano infligido: " + (int)dano + ".");
                System.out.println("HP de " + heroi.getNome() + ": " + heroi.getHp() + ".");
                System.out.println("HP de " + inimigo.getNome() + ": " + inimigo.getHp() + ".\n");
                
                proximoAtaque = 0; // Na próxima iteração, será a vez do inimigo atacar
            }           
        }
        
        // Exibe mensagens relativas ao resultado da batalha
        
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