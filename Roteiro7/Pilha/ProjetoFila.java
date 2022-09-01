package Pilha;

import java.util.ArrayList;

public class ProjetoFila {
   
    public Object[] pilha;   
    public int posicaoFila;
    private ArrayList<Object> elemento;
    public int n;

    public ProjetoFila(int i) {
        elemento = new ArrayList<>();     
    }

    public Integer retirarDaFila() {
        posicaoFila = pilha.length;
        for (int i = 0; i < pilha.length; i++) {
            n = posicaoFila - 1;
        }
        return posicaoFila;
    }

    public void incluirNaFila(Integer k) {
        for (int i = 0; i < pilha.length; i++) {
            n = k;
            k = posicaoFila + 1;
        }
    }

    public void imprimirFila() {
        for (Object pilha1 : pilha) {
            System.out.println(pilha1);
        }
    }

    public Object[] getPilha() {
        return pilha;
    }

    public void setPilha(Object[] vet) {
        this.pilha = vet;
    }

    public int getPosicaoFila() {
        return posicaoFila;
    }

    public void setPosicaoFila(int posicaoFila) {
        this.posicaoFila = posicaoFila;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
