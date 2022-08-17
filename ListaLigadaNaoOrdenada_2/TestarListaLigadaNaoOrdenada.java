public class TestarListaLigadaNaoOrdenada {
		public static void main(String args[]){
			ListaLigadaNaoOrdenada lista = new ListaLigadaNaoOrdenada();
			lista.acrescentarNoFinal(new Nodo(5));
			lista.acrescentarNoInicio(new Nodo(10));
			lista.acrescentarNoInicio(new Nodo(20));
			lista.acrescentarNoInicio(new Nodo(30));
			lista.acrescentarNoInicio(new Nodo(49));
			lista.acrescentarNoInicio(new Nodo(120));
			
			lista.excluirElemento(49);
			lista.imprimirLista();
	}
}
