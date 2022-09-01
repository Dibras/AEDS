
package pesquisa_V2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class pesquisa_V2 {

        
    public static int pesquisaSimples(int[] v, int n, int chave) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == chave) {
                return i;
            }
        }
        return -1;
    }
    public static void bolha (int v[], int n){
    for (int i = n -1; i >= 1; i--){
        for(int j = 0; j < i; j++){
            if(v[j] > v[j +1]){
                int temp = v[j];
                v[j] = v[j+1];
                v[j + 1] = temp;
            }
        }
    }
}
    public static int pesquisaBinaria(int x[], int n, int k) {
        int i = 0;
        int j = n - 1;
        int pivo = 0;

        do {
            pivo = (i + j) / 2;
            if (k > x[pivo]) {
                i = pivo + 1;
            } else {
                j = pivo - 1;
            }
        } while ((x[pivo] != k) && (i <= j));
        if (x[pivo] == k) {
            return pivo;
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int chave;
        String answer;
        int[] v = {25, 48, 37, 12, 57, 86, 33, 92};
        System.out.println("Conteudo do vetor: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(v[i] + " ");
        }
        answer = JOptionPane.showInputDialog(null, "Digite a chave a ser pesquisada no vetor: ");
        chave = Integer.parseInt(answer);

        int posicao = pesquisaSimples(v, 8, chave);
        if (posicao >= 0) {
            System.out.println("A chave foi encontrada na posicao: " + posicao);
        } else {
            System.out.println("Chave não foi encontrada!");
        }
        
        System.out.println("Ordenar vetor");
        bolha(v, 8);
        
        System.out.println("Conteudo do vetor ordenado");
        for(int i = 0; i < 8; i++){
            System.out.println(v[i]);
        }
        answer = JOptionPane.showInputDialog(null, "Digite a chave a ser pesquisada no vetor: ");
        chave = Integer.parseInt(answer);
        posicao = pesquisaBinaria(v, 8, chave);
        if (posicao >= 0) {
            System.out.println("A chave foi encontrada na posicao: " + posicao);
        } else {
            System.out.println("Chave não foi encontrada!");
        }
        System.out.println("Fim do programa!");
}
}
