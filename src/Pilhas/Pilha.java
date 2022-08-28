package Pilhas;

public class Pilha {
    private Ligacao lista;

    public Pilha(){
        this.lista = new Ligacao();
    }

    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }

    public void remover(){
        this.lista.remover(this.get());
    }

    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
