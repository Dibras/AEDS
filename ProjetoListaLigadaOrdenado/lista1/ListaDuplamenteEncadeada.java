package lista1;

public class ListaDuplamenteEncadeada {
	private Nodo primeiro;
	private Nodo ultimo;

	public Nodo getNodo() {
		return new Nodo();
	}

	public ListaDuplamenteEncadeada() {
		primeiro = null;
		ultimo = null;
	}

	public void imprimirListaOrdemDireta() {
		Nodo aux = primeiro;
		if (aux == null) {
			System.out.println("A lista está vazia!");
		} else {
			System.out.print("Conteúdo da lista: ");
			while (aux != null) {
				//System.out.print(ultimo);
				System.out.print(aux.getChave());
				aux = aux.getNext();
				System.out.print(" ");
			}
			System.out.println("");
			System.out.println("Fim do conteudo da lista.");
		}
	}

	public void imprimirListaOrdemReversa() {
		Nodo aux = ultimo;
		if (aux == null) {
			System.out.println("A lista está vazia!");
		} else {
			System.out.print("Conteudo da lista: ");
			while (aux != null) {
				System.out.print(aux.getChave());
				aux = aux.getAnterior();
				System.out.print(" ");
			}
			System.out.println("");
			System.out.println("Fim do conteudo da lista.");
		}
	}

	public Nodo pesquisar(int chave) {
		Nodo aux = primeiro;
		if (aux == null) {
			return null;
		}
		do {
			if (aux.getChave() == chave) {
				return aux;
			} else {
				aux = aux.getNext();
			}
			if (aux == null)
				break;
		} while (true);
		return null;
	}
/* 
	public void acrescentarNoFinal(Nodo item) {
		Nodo aux;
		if (ultimo == null) {
			aux = this.getNodo();
			primeiro = aux;
			ultimo = aux;
			aux.setChave(item.getChave());
		} else {
			aux = this.getNodo();
			ultimo.setNext(aux);
			aux.setChave(item.getChave());
			aux.setAnterior(ultimo);
			ultimo = aux;
		}
	}
*/
	public void acrescentarItem(Nodo item) {
		Nodo aux;
		Nodo aux2;
		if (primeiro==null) {
			aux = this.getNodo();
			primeiro = aux;
			ultimo = aux;
			aux.setChave(item.getChave());
		}else {
		aux = this.pesquisar(item.getChave());
		if (aux == null){
			
			aux = this.getNodo();
			aux2 = primeiro;
			aux.setChave(item.getChave());

			while(aux2!=null){
				if (aux.getChave()>aux2.getChave()){
					if (aux2==ultimo){
						ultimo.setNext(aux);
						aux.setAnterior(ultimo);
						ultimo = aux;
						break;
					}else{
					aux2 = aux2.getNext();
					}
				}else{
					if (aux2.getAnterior()==null) {
						aux.setNext(primeiro);
						primeiro.setAnterior(aux);
						primeiro = aux;
						break;
					}else{
					aux2.getAnterior().setNext(aux);
					aux.setAnterior(aux2.getAnterior());
					aux.setNext(aux2);
					aux2.setAnterior(aux);
					break;
					}
				  }
				}
			}
		}
	}

	public void excluirLista() {
		primeiro = null;
		ultimo = null;
	}

	public Nodo excluir(int chave) {

		Nodo aux = this.pesquisar(chave);
		Nodo chaveExcluida = new Nodo(-1);
		if (aux == null) {
			return chaveExcluida;
		} else {
			if (aux.getAnterior()==null) {
				primeiro = aux.getNext();
				primeiro.setAnterior(null);
				chaveExcluida.setChave(aux.getChave());
				aux=null;
				return chaveExcluida;
			}
			if(aux.getNext()==null) {
				ultimo = aux.getAnterior();
				ultimo.setNext(null);
				chaveExcluida.setChave(aux.getChave());
				aux = null;
				return chaveExcluida;
			}
			
			chaveExcluida.setChave(aux.getChave());
			aux.getAnterior().setNext(aux.getNext());
			aux.getNext().setAnterior(aux.getAnterior());
			aux = null;
			
		}
		return chaveExcluida;
	}
}