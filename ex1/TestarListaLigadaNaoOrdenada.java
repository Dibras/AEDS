package lista;
public class TestarListaLigadaNaoOrdenada {
	public static void main(String args[]){
	ListaLigadaNaoOrdenada lista = new ListaLigadaNaoOrdenada();
	lista.imprimirLista();
	lista.acrescentarNoFinal(new Nodo(5));
	lista.imprimirLista();
	lista.acrescentarNoInicio(new Nodo(10));
	lista.imprimirLista();
	
	}
}
