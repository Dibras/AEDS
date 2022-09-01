import javax.swing.JOptionPane;

public class pilha {

    private Object[] pilha;
    private int posicaoPilha;

    public pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[100];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public void empilharPilha(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public Object desempilharPilha() {
        int a = posicaoPilha - 1;
        if (pilhaVazia()) {
            return null;
        }
        System.out.println("Ultima posição: " + a);
        return this.pilha[this.posicaoPilha - 1];

    }

    public void imprimirConteudo() {
        System.out.println("A posição da pilha é: " + posicaoPilha + "e a quantidade de objetos é: " + tamanho());
    }

    public void esvaziarPilha() {
        for (int i = 0; i < pilha.length; i++) {
            pilha[i] = 0;
        }
        for (Object i : pilha) {
            System.out.println(i);
        }
    }

    public Object[] getPilha() {
        return pilha;
    }

    public void setPilha(Object[] pilha) {
        this.pilha = pilha;
    }

    public int getPosicaoPilha() {
        return posicaoPilha;
    }

    public void setPosicaoPilha(int posicaoPilha) {
        this.posicaoPilha = posicaoPilha;
    }

    public static void main(String[] args) {
        pilha p = new pilha();
        p.empilharPilha("Portuguesa ");
        p.empilharPilha("catupiry ");
        p.empilharPilha("Calabresa ");
        p.empilharPilha("Quatro ");
        p.empilharPilha(10);
        p.desempilharPilha();
        p.imprimirConteudo();
        p.esvaziarPilha();        
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilharPilha());
        }
    }
}
