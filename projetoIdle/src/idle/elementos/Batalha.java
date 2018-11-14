package idle.elementos;

import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Batalha{
	public String chat;
	public boolean desafiarBoss;
        //Atributo do tipo heroi(objeto)
        private Heroi heroi;
        //Atributo do tipo inimigo(objeto)
        private Inimigo inimigo;
        
        
        public Batalha(Heroi heroi, Inimigo inimigo){
            heroi.setHp(50);
            heroi.setAtq(20);
            heroi.setDefesa(15);
            
            inimigo.setHp(50);
            inimigo.setAtq(20);
            inimigo.setDefesa(10);
  
            
            while(heroi.getHp() > 0 && inimigo.getHp()>0){
                heroi.ataque(heroi, inimigo);
                inimigo.ataque(inimigo, heroi);

            }

        }

}