package Pilha;

public class TestarPilha {
    public static void main(String a[]){
        System.out.println("\nInício main");
        TADPilha pilha = new TADPilha(1);
        pilha.push(5);
        pilha.push(11);
        pilha.push(3);
        pilha.imprimirPilha();
        pilha.push(20);
        pilha.push(5);
        pilha.imprimirPilha();
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        pilha.imprimirPilha();
        System.out.println("Fim main");
        }  
}   


