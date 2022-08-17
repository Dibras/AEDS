package lista1;

public class TestarListaDuplamenteEncadeada {
	public static void main(String args[]) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		lista.imprimirListaOrdemDireta();

		lista.acrescentarItem(new Nodo(30));
		lista.imprimirListaOrdemDireta();

		lista.acrescentarItem(new Nodo(40));
		lista.imprimirListaOrdemDireta();
		
		lista.acrescentarItem(new Nodo(20));
		lista.imprimirListaOrdemDireta();
		
		lista.acrescentarItem(new Nodo(40));
		lista.imprimirListaOrdemDireta();
		
		lista.acrescentarItem(new Nodo(50));
		lista.imprimirListaOrdemDireta();
		
		lista.acrescentarItem(new Nodo(10));
		lista.imprimirListaOrdemDireta();

		lista.excluir(10);
		lista.imprimirListaOrdemDireta();
		
		lista.imprimirListaOrdemReversa();
	}
}
