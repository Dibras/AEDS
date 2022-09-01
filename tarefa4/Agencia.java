
package tarefa4;

public class Agencia extends Conta{
    private int codigo;
    private String descricao;
    private int numeroContas;   
    public final int TAMANHO=10;
    Conta listaContas[];

    public Agencia(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    public int pesquisar(Conta c) {
        for (int i = 0; i < numeroContas; i++) {
            if (c.equals(listaContas[i].getNumero())){
                return i;           
            }
        }
        return -1;
    }
    public void atualizar(Conta c){
        c.imprimirDadosConta();      
    }
    public int adicionar(Conta c) {
       if(numeroContas == TAMANHO){
           return -1;
       }
       listaContas[numeroContas++] = c;
       c.getTitular();
       c.getNumero();
       c.getSaldo();
       return 1;
    }
    public void excluirConta(Conta c) {
        for (int i = 0; i < numeroContas; i++) {
            if (c.equals(listaContas[i])) {
                listaContas[i] = listaContas[numeroContas - 1];
                numeroContas--;
            }
        }
    }
    public void excluirConta(int coord) {
        this.listaContas[coord] = this.listaContas[numeroContas - 1];
        numeroContas--;
    }
    

    public void listarContas() {
        for (int i = 0; i < numeroContas; i++) {
            listaContas[i].imprimirDadosConta();
        }
    }
    public void ordenarContas(){
        for (int i = 0; i < listaContas.length; i++) {
            System.out.println(listaContas[i]);
        }
        System.out.println("\n");
    }
    /* Ordenação bolha */
    public static void bolha(Conta lista[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (lista[j].getNumero() > lista[j + 1].getNumero()) {
                    /* troca */
                    Conta temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Conta lista[] = new Conta[200];
        lista[0] = new Conta(3, "Maria", 5); // Construtor para número, titular e saldo.
        lista[1] = new Conta(2, "José", 10);
        lista[2] = new Conta(1, "Carlos", 8);
        lista[3] = new Conta(5, "João", 4);
        lista[4] = new Conta(4, "Raul", 7);
        bolha(lista, 5);
        for (int i = 0; i < 5; i++) {
            lista[i].imprimirDadosConta();
        }
    }
    public void quickSort(int listaContas[], int indiceEsquerdo, int indiceDireito) {
        int i = indiceEsquerdo;
        int j = indiceDireito;
        int meio;
        if (indiceDireito > indiceEsquerdo) {
            meio = listaContas[(indiceDireito + indiceEsquerdo) / 2];
            while (i <= j) {
                while ((i < indiceDireito) && (listaContas[i] < meio)) {
                    ++i;
                }
                while ((j > indiceEsquerdo) && (listaContas[j] > meio)) {
                    --j;
                }
                if (i <= j) {
                    swap(listaContas, i, j);
                    ++i;
                    --j;
                }
            }
            if (indiceEsquerdo < j) {
                quickSort(listaContas, indiceEsquerdo, j);
            }
            if (i < indiceDireito) {
                quickSort(listaContas, i, indiceDireito);
            }
        }
    }

    private void swap(int[] listaContas, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
