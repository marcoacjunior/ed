package TabelaHash;



public class Main { 
	ListaDinamica Vetor[];

	public Main() {
		Vetor = new ListaDinamica[26];
		inicializaListas();
	}
	final void inicializaListas() {
		for (int i = 0; i<26; i++) { // 26 = posições letras dicionário
			Vetor[i] = new ListaDinamica();
		}
	}
	final int funcaoHash(String palavra) {
		// calcular o valor hash da palavra
		
		palavra = palavra.toLowerCase();
		int posicao = palavra.charAt(0);
		
		return posicao - 97; //tabela ASCII
	}
	final void addTabela(String palavra, String descricao) {
		Vetor[funcaoHash(palavra)].add(palavra, descricao);
		
	}
	
	final void excluirItem(String palavra) {
		System.out.println("***Itens nesse indice:***\n");
		Vetor[funcaoHash(palavra)].ImprimeLista();
		Vetor[funcaoHash(palavra)].removeItem(palavra);
		System.out.println("***Itens nesse indice após excluir:***\n");
		Vetor[funcaoHash(palavra)].ImprimeLista();
	}
	
	final void buscaPalavra(String palavra) {  
		Vetor[funcaoHash(palavra)].buscaItem(palavra);
		
	}
	
	public static void main(String[] args) {
		Main teste = new Main();
		teste.addTabela("Gato", "Pequeno mamífero carnívoro doméstico");
		teste.addTabela("Superficial", "De importância reduzida, sem o mais importante");
				
		teste.buscaPalavra("Gato");
		
        //Complexidade de Espaço = O(n)
        //Complexidade de Tempo:
        //Adicionar = O(1)
        //Remover = O(1)
        //Buscar = O(1) ou O(n) se tiver colisões
		
	}
	
}
