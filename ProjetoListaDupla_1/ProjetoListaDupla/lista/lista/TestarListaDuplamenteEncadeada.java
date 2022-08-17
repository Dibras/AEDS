package lista;

public class TestarListaDuplamenteEncadeada {
	public static void main(String args[]) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		lista.imprimirListaOrdemDireta();
		lista.acrescentarNoInicio(new Nodo(30));
		lista.imprimirListaOrdemDireta();
		lista.acrescentarNoFinal(new Nodo(50));
		lista.imprimirListaOrdemDireta();
		lista.acrescentarNoFinal(new Nodo(60));
		lista.imprimirListaOrdemDireta();
		lista.acrescentarNoFinal(new Nodo(80));
		lista.imprimirListaOrdemDireta();
		lista.acrescentarNoFinal(new Nodo(90));
		lista.imprimirListaOrdemDireta();
		
		lista.excluir(90);
		
		lista.imprimirListaOrdemDireta();
		
/*
		Nodo resultado = lista.pesquisar(50);

		if (resultado != null) {
			System.out.println("Chave encontrada: " + resultado);
		} else {
			System.out.println("Chave não foi encontrada: " + resultado);
		}
		lista.imprimirListaOrdemReversa();
		lista.acrescentarNoInicio(new Nodo(20));
		lista.imprimirListaOrdemReversa();
		lista.imprimirListaOrdemDireta();
		lista.excluir(30);
		lista.imprimirListaOrdemDireta();
		lista.imprimirListaOrdemReversa();

		lista.excluir(30);
		lista.imprimirListaOrdemDireta();

		lista.excluir(50);
		lista.imprimirListaOrdemDireta();
		
		*/
	}
}
