package Pilha;

public class TestarFila {

    public static void main(String[] args) {
        System.out.println("\nInício main");
        ProjetoFila fila = new ProjetoFila(1);
        fila.incluirNaFila(5);
        fila.incluirNaFila(11);
        fila.incluirNaFila(3);
        fila.imprimirFila();
        fila.incluirNaFila(20);
        fila.incluirNaFila(5);
        fila.imprimirFila();
        System.out.println(fila.retirarDaFila());
        System.out.println(fila.retirarDaFila());
        fila.imprimirFila();
        System.out.println("Fim main");
    }
}
