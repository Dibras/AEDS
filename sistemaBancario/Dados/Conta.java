package Dados;

import java.util.Objects;

/**
 *
 * @author lucas e Gusatvo Vilela
 */
public class Conta {
    private String numero;
    private String titular;
    private double saldo;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta(String numero, String titular, String cpf) {
        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
    }

    public void inicializar() {
        System.out.println("Bem vindo Senhor: " + titular);
    }

    public void depositar(double valor) {
        try {
            if (valor > 0) {
                setSaldo(getSaldo() + valor);
                System.out.println("Débito realizado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Houve um erro em realizar essa solicitacao. Por favor, tente mais tarde!");
        }

    }

    public void imprimirDadosConta() {
        System.out.println("Atualmente o numero da conta é: " + numero + "." + "\n" + "O titular é: " + titular + "."
                + "\n" + "Seu saldo disponível é: " + saldo + "\n");

    }

    public void saque(double valor) {
        try {

            if (valor > 0 && this.getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Houve um problema em realizar essa solicitacao. Por favor, tente mais tarde!");
        }
    }

    public void pix(Conta contaDepositar, double valor) {
        try {

            if (valor > 0 && this.getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                contaDepositar.saldo = contaDepositar.getSaldo() + valor;
                System.out.println("Pix enviado som sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Houve um problema em realizar o pix!");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

}
