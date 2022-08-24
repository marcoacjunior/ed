package Pilhas;

public class Main {

    public static void main(String[] args) {
       
    	Pilha pilha = new Pilha();

        pilha.adicionar("2");
        pilha.adicionar("9");
        pilha.adicionar("8");
        pilha.adicionar("7");
        pilha.adicionar("5");

        System.out.println("Topo: " + pilha.get());
        
        pilha.remover();

        System.out.println("Novo Topo: " + pilha.get());
        
        pilha.remover();

        System.out.println("Novo Topo: " + pilha.get());


}
}