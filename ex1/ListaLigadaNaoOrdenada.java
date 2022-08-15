package lista;
public class ListaLigadaNaoOrdenada {
	private Nodo primeiro;
	private Nodo ultimo;
	public ListaLigadaNaoOrdenada(){
		primeiro=null;
		ultimo=null;
	}
	public Nodo getNodo(){
		return new Nodo();
	}
	public void imprimirLista(){
		Nodo aux=primeiro;
		while (aux!=null){
			System.out.println(aux.getChave());
			aux=aux.getNext();
		}
	}
	public void acrescentarNoFinal(Nodo item){
		Nodo aux;
		if (ultimo==null){
			aux=this.getNodo();
			primeiro=aux;
			ultimo=aux;
			aux.setChave(item.getChave());
		}
		else{
			aux=this.getNodo();
			ultimo.setNext(aux);
			ultimo=aux;
			aux.setChave(item.getChave());
		}
	}
	public void acrescentarNoInicio(Nodo item){
		
		Nodo aux;
		if (ultimo==null){
			aux=this.getNodo();
			primeiro=aux;
			ultimo=aux;
			aux.setChave(item.getChave());
		}
		else{
			aux=this.getNodo();
			aux.setNext(primeiro);
			primeiro=aux;
			aux.setChave(item.getChave());
		}
		
	}
	public void excluirElemento(Nodo item){
		Nodo aux = primeiro;
		while (aux != null){
			if (aux.getChave() == item.getChave()) {
				
			}
			aux=aux.getNext();
		}
		
	}
}
