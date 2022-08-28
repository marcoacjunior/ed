package ListaEncadeada;


public class Main{
    public static void main(String[] args) {
        
    	Lista lista = new Lista();
        
    	lista.insert(8);
        lista.insert(3);
        lista.insert(6);
        lista.insert(4);
        lista.insert(5);
        lista.insert(7);
        lista.insert(1);
        lista.insert(0);
        lista.remove(4);
        lista.remove(888);
        lista.show();
        System.out.println(lista.search(8));
        
        //Complexidade de Espaço = O(n)
        //Complexidade de Tempo:
        //Adicionar = O(1)
        //Remover = O(1)
        //Percorrer = O(n)
        
    }
}