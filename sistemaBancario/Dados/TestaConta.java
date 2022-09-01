package Dados;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas e Gusatvo Vilela
 */
public class TestaConta {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema Bancario");
        int ans = JOptionPane.showConfirmDialog(null, "Deseja criar uma conta?");
        if (ans == JOptionPane.YES_OPTION) {
            //new Agencia(417, "Banco do Brasil");
            //Agencia.criarConta();]
            Conta conta1 = new Conta("123", "Gu", "131");
            System.out.println(conta1);
            Conta conta_invet = new ContaInvestimento("12344", "Gu2", "13144");
            System.out.println(conta_invet);

        }
    }
}
