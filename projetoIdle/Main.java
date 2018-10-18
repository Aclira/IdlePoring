public class Main{
	public static void main(String args[]){
		Hero herone = new Hero(1, 2, 3, 4, 5, 6, 7,"Arqueiro","Lino","Humano",10,10);
		System.out.println(herone.getForca()+" "+herone.getVit()+" "+herone.getDest()+" "+herone.getAgil()+" "+herone.getSorte()+" "+herone.getIntelig()+" "+herone.getExp()+" "+herone.getClasse()+" "+ herone.getNome()+" "+herone.getRaca()+" "+herone.getHp()+" "+herone.getMp());
	}
}