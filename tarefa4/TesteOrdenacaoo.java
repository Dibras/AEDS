package tarefa4;

import java.util.Random;
import java.util.Scanner;

public class TesteOrdenacaoo {

    int contador = 0;

    public static void main(String[] args) {
        int vet[] = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Prezado usuário, por favor digite um número: ");
            vet[i] = in.nextInt();
        }
        System.out.println("\n");
        System.out.println("Desordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        bolha(vet, 10);
        System.out.println("\n");
        System.out.println("Ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println("\n");

        carregarVetor(vet, 100);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

    }

    public static void bolha(int v[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (v[j] > v[j + 1]) {
                    /* troca */
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void carregarVetor(int v[], int n) {
        Random random = new Random();
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = v[i];
            v[i] = random.nextInt(10);
            System.out.println(v[i]);
        }
    }
}

