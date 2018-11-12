package idle.elementos;

//import java.util.Timer;
//import java.util.TimerTask;
import idle.personagem.Heroi;
import idle.personagem.Inimigo;

public class Batalha{
	public String chat;
	public boolean desafiarBoss;
        Heroi heroi;
        Inimigo inimigo;
        
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