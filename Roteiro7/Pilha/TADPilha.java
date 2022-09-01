package Pilha;

import java.util.ArrayList;

public class TADPilha {

    public Object[] pilha;
    public int posicaoPila;
    private ArrayList<Object> elementos;
    public int n;
    public int item;

    public TADPilha(int i) {
       elementos = new ArrayList<>();
    }

    public Object[] getPilha() {
        return pilha;
    }

    public void setPilha(Object[] pilha) {
        this.pilha = pilha;
    }

    public int getPosicaoPila() {
        return posicaoPila;
    }

    public void setPosicaoPila(int posicaoPila) {
        this.posicaoPila = posicaoPila;
    }

    public ArrayList<Object> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Object> elementos) {
        this.elementos = elementos;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
    public Integer pop() { //desempilha o último elemento empilhado. 

        n = elementos.size(); ////o size é a quantidade de elementos.
        if (n > 0) {
            item = (Integer) elementos.get(n - 1);
            elementos.remove(n - 1);
        } else {

            System.out.println("Pilha vazia!");
        }
        return item;
    }

    public void push(Integer k) { // empilha o elemento k 
        elementos.add(k);

    }

    public void imprimirPilha() { // imprime o conteúdo da pilha. 
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(elementos.get(i));
        }

    }

    void incluirNaFila(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  

