// Exemplo de implementação do iterator utilizando vetor

package expurgobelzebobo.principal.iterator;

import expurgobelzebobo.elementos.itens.Item;

public class ItemVetor implements InterfaceIterator {
    
    private final Item[] lista = new Item[100]; // Cria uma nova lista do objeto item
    private int cont = 0;                       // Cria um contador para adicionar elementos na lista
    private int quan = 0;                       // Variável auxliar para acessar elementos da lista
    
    @Override // Retorna o tamanho da lista
    public int tam() {
        return cont;
    }
    
    @Override // Verifica se a lista está vazia
    public boolean empity() {
        return lista[0] != null;
    }
    
    @Override // Adiciona um item a lista
    public void add(Item item) {
        lista[cont] = item;
        cont++;
    }
    
    @Override // Remove um item da lista
    public void rem(Item item) {
        
        while(lista[quan] != item) {
            quan++;
        }
        
        lista[quan] = null;
        
        while(lista[quan+1] != null) {
            lista[quan] = lista[quan+1];
        }
        
        quan = 0;
    }
    
    @Override // Retorna um item da lista
    public Item next(int indice) {
        return lista[indice];
    }
}
