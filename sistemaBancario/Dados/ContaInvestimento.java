package Dados;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas e Gusatvo Vilela
 */
public class ContaInvestimento extends Conta {
    private String codigoInvestimento;
    private String cpf;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String titular;
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    private int idade;
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    private int celular;
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    private double salario;
    private double investir;
    public ArrayList<Conta> investimento;

    public double getInvestir() {
        return investir;
    }
    public void setInvestir(double investir) {
        this.investir = investir;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public String getCodigoInvestimento() {
        return codigoInvestimento;
    }
    public void setCodigoInvestimento(String codigoInvestimento) {
        this.codigoInvestimento = codigoInvestimento;
    }
    public ContaInvestimento(String cpf, String titular, String codigoInvestimento){
        super(titular, titular, titular);
        checkIdade(idade);
        this.cpf = cpf;
        this.titular = titular;
        this.codigoInvestimento = codigoInvestimento;
    }
    public void saqueInvestimento(int valor){
        if((valor) == 0 || valor <= 0){
            JOptionPane.showMessageDialog(null, "Voce nao possui recursos necessarios para realziar essa acao!");
        } else{
            saque(valor);
        }         
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
    public void investimento(int valor){
        investimento = new ArrayList<Conta>();
        depositar(valor);
        try {
            Object[] itens = {"Longo Prazo", "Curto Prazo"};
            Object selectedValue = JOptionPane.showInputDialog(null, "Escolha o tipo de investimento que voce quer: ", "Opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if(valor > 0 ){
            if(selectedValue == "Longo Prazo" && valor > 0){
                investir = investir + valor * 1.5;
            }
            if(selectedValue == "Curto Prazo"){
                investir = investir + valor * 1.09;
            }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Adicione fundos para realizar o investimento.");
        }
    } 
    @Override
    public String toString() {
        return "Conta{" + "codigoInvestimento=" + codigoInvestimento + ", titular=" + titular + '}';
    }    
}
    



