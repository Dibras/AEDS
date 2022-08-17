package lista1;

public class Nodo {
	private int chave;
	private Nodo next;
	private Nodo anterior;

	public Nodo(int chave) {
		this.chave = chave;
		next = null;
		anterior = null;
	}

	public Nodo() {
		this.chave = 0;
		next = null;
		anterior = null;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "Nodo{" + "chave=" + chave + '}';
	}
}