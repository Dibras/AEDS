package Dados;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas e Gusatvo Vilela
 */

public class ContaCorrente extends Conta{
    private int cpf;
    private String titular;
    private int idade;
    private int celular;
    private double salario;
    private int codigoInvestimento;
    public ArrayList<Conta> investimento;

    public ContaCorrente(int cpf, String titular, int codigoInvestimento){
        super(titular, titular, titular);
        checkIdade(idade);
        this.cpf = cpf;
        this.titular = titular;
        this.codigoInvestimento = codigoInvestimento;
    }

    public void checkIdade(int idade){
        investimento = new ArrayList<Conta>();
        String check;
        check = JOptionPane.showInputDialog(null, "Digite a sua idade: ");
        idade = Integer.parseInt(check);
        while(idade <= 18){
            JOptionPane.showMessageDialog(null, "Não é possível criar uma conta!");
            break;
        }
    }
    private void saquePoupança(int valor){
        saque(valor);
    }
    private void depositar(int valor){
        depositar(valor);
    }

}
