import Dados.Conta;

public class ContaPoupança extends Conta{
    private String titular;
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    private int celular;
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    private int codigoConta;
    public int getCodigoConta() {
        return codigoConta;
    }
    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }
    public int valor;

    public ContaPoupança(int celular, String titular, int cpf) {
        super(celular, titular, cpf);
        this.celular = celular;
        this.titular = titular;
        this.cpf = cpf;

    }
    private void saquePoupança(int valor){
        saque();
    }
    
    private void depositar(int valor){
        depositar();
    }
    public void informacaoPoupanca(CONTA conta){
        imprimirDadosConta();
    }
}
