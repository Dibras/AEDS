package tarefa4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class vectorPositivo {

    public static void main(String[] args) {

        String x;
        int y;
        int a[] = new int[100];          
        for (int i = 0; i < a.length; i++) {
            x = JOptionPane.showInputDialog(null, "Digite um número: " + (i + 1));
            a[i] = Integer.parseInt(x);
            y = Integer.parseInt(x);
            if( y > 0){
               System.out.println(x);
            }else{
                JOptionPane.showMessageDialog(null, "Programa finalizado!");
                break;
            }
            
        }
        for (int i = 0; i < a.length; i++) {
            double T;
            x = JOptionPane.showInputDialog(null, "Digite um número: " + (i + 1));
            a[i] = Integer.parseInt(x);
            T = Integer.parseInt(x);
            System.out.println("Numero digitado: "+x);
        }
    }
}

