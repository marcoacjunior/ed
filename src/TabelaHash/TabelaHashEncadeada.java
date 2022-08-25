package TabelaHash;

import java.util.ArrayList;
import java.util.Iterator;


public class TabelaHashEncadeada {

    private ArrayList<Aluno>[] tabela;
    private final int CAPACIDADE_DEFAULT = 101;


    @SuppressWarnings("unchecked")
	public TabelaHashEncadeada() {
        this.tabela = new ArrayList[CAPACIDADE_DEFAULT];
    }

    @SuppressWarnings("unchecked")
	public TabelaHashEncadeada(int capacidade) {
        this.tabela = new ArrayList[capacidade];
    }
    

    private int hash(Integer chave) {
        return chave % this.tabela.length;
    }

    @SuppressWarnings("unused")
	private int hashMultiplicacao(Integer chave) {
        double a = 0.617648934;
        double hash = chave*a;
        hash = (hash % 1) * this.tabela.length;
        return (int)hash;        
    }
    
    public void put(Integer chave, Aluno valor) {
        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];
        
        if (alunos == null) {
            alunos = new ArrayList<Aluno>();
            alunos.add(valor);
            this.tabela[hash] = alunos;

        } else {
            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getMatricula() == chave) {
                    alunos.set(i, valor);
                    return;
                }
            }
            alunos.add(valor);
        }    
    }

    public Aluno get(Integer chave) {
        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];
        
        if (alunos == null || alunos.isEmpty()) 
                return null;
        
        for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(chave))
                    return aluno;
        }
        
        return null;
    }  

    public Aluno remove(int chave) {
        int hash = hash(chave);
        ArrayList<Aluno> alunos = this.tabela[hash];
        
        Iterator<Aluno> it = alunos.iterator();
        Aluno atual = null;
        
        while (it.hasNext()) {
                atual = it.next();
                if (atual.getMatricula().equals(chave)) {
                    it.remove();
                    return atual;
                }
        }
        
        return atual;
    }  

}