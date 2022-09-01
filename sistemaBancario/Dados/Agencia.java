package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas e Gusatvo Vilela
 */

 
public class Agencia {
    private int codigo;
    public final int TAMANHO = 10;
    private static String nome;
    private static int numeroContas;
    private static int numeroAgencias;
    public static ArrayList<Conta> contasBancarias;
    public static ArrayList<Agencia> agenciasBancarias;
    

    public Agencia(int codigo, String nome) {
        this.codigo = codigo;
        Agencia.nome = nome;
        Agencia.numeroContas = 0;
        contasBancarias = new ArrayList<Conta>();
    }

    public static void operacoes() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-----------Bem vindo ao sistema de Agencia Bancaria-------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("***********Selecione uma opcao que deseja realizar**************");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|        Opcao 1 - Criar Conta.                                  |");
        System.out.println("|        Opcao 2 - Depositar.                                    |");
        System.out.println("|        Opcao 3 - Sacar.                                        |");
        System.out.println("|        Opcao 4 - Transferir.                                   |");
        System.out.println("|        Opcao 5 - Listar.                                       |");
        System.out.println("|        Opcao 6 - Pesquisar conta Corrente ou Poupança.         |");
        System.out.println("|        Opcao 7 - Incluir nova conta.                           |");
        System.out.println("|        Opcao 8 - Alterar dados da conta.                       |");
        System.out.println("|        Opcao 9 - Excluir conta.                                |");
        System.out.println("|        Opcao 10 - Sair.                                        |");

        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        switch (op) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                saque();
                break;
            case 4:
                pix();
                break;
            case 5:
                listarContas();
                break;
            case 6:
                pesquisar();
                break;
            case 7:
                adicionarConta();
                break;
            case 8:
                alterarDados();
                break;
            case 9:
                excluirConta();
                break;
            case 10:
                System.out.println("Obrigado por usar nosso servico!");
                break;
            default:
                System.out.println("Opcao invalida!");
                operacoes();
                break;

        }
    }

    public static void criarConta() {
        String usuario, celular, cpf;
        int assoc;
        celular = JOptionPane.showInputDialog(null, "Informe o seu celular: ");
        assoc = Integer.parseInt(celular);
        usuario = JOptionPane.showInputDialog(null, "Informe o seu nome: ");
        assoc = Integer.parseInt(usuario);
        cpf = JOptionPane.showInputDialog(null, "Informe o seu CPF: ");
        assoc = Integer.parseInt(cpf);
        
        Conta conta = new Conta(celular, usuario, cpf);
        try {
            Object[] itens = {"Conta Corrente", "Conta Investimento", "Conta poupança"};
            Object selectedValue = JOptionPane.showInputDialog(null, "Escolha o tipo de conta que voce quer abrir: ", "Opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if(selectedValue == "Conta corrente"){
                System.out.println("Conta Corrente criada com sucesso!");
            }
            if( selectedValue == "Conta Investimento"){
                System.out.println("Conta Investimento criada com sucesso!");
            }
            if(selectedValue == "Conta Poupança"){
                System.out.println("Conta Poupança criada com sucesso!");
            }
            contasBancarias.add(conta);
            System.out.println("Conta criada com sucesso!");
        } catch (Exception e) {
            System.out.println("Verifique os endereços e tente novamente");
        }
    }
    public void alterarDados(String numeroContas){
       // Connection con = Agencia.getConnection();
       // PreparedStatement pstm = null;
       // pstm = con.prepareStatement("update Conta ");
        int id_Conta;
        String nome_titular, celular_titular;
        //int numeroContas2 = Integer.parseInt(numeroContas);
        
        for (int i = 0; i < numeroContas; i++) {
            if (contasBancarias.size() > 0) {
                for (Conta c : contasBancarias) {
                    if (c.getNumero() == numeroContas);
                    Conta conta = c;
                    c.setNumero("");
                    c.setTitular("titular");
                    c.setNumero("numero");
                }
            }
        }       
    }
    private static Conta pesquisar(int numeroContas) {
        Conta conta = null;
        for (int i = 0; i < numeroContas;) {
            if (contasBancarias.size() > 0) {
                for (Conta c : contasBancarias) {
                    if (c.getNumero() == numeroContas);
                    conta = c;
                }
            }
            return conta;
        }
        return conta;
    }
    public int inserir(Conta c) {
        if (numeroContas == TAMANHO) {
            return -1;
        }
        listaContas[numeroContas++] = c;
        return 1;
    }
    public void excluirConta(Conta c) {
        for (int i = 0; i < numeroContas; i++) {
            if (c.equals(listaContas[i])) {
                listaContas[i] = listaContas[numeroContas - 1];
                numeroContas--;
            }
        }
    }
    public void excluirConta(int coord) {
        this.listaContas[coord] = this.listaContas[numeroContas - 1];
        numeroContas--;
    }
    public static void listarContas() {
        try {
            if (contasBancarias.size() > 0) {
                for (int i = 0; i < numeroContas; i++) {
                    listaContas[i].imprimirDadosConta();
                }
            }
        } catch (Exception e) {
            System.out.println("Nao ha contas cadastradas no momento!");
        }
    }

    public void inicializar() {
        for (int i = 0; i < numeroContas; i++) {
            listaContas[i] = null;
        }
        numeroContas = 0;
    }

    public static void alterarDados() {
        for(int i =0; i < numeroContas; i++){
            if(agenciasBancarias.size() > 0){
                for(Conta c: agenciasBancarias){
                    if(c.getNumero() ==numeroContas);
                   
                }
            }
        }
    }

    public int inserirAgencia(Agencia agencia) {
        if(numeroAgencias = TAMANHO){
            return -1;
        }
        listaAgencia[numeroAgencias++] = agencia;
        return 1;
    }

    public void excluirAgencia(int codigo) {
        for (int i = 0; i < numeroAgencias; i++) {
            if (c.equals(listaAgencia[i])) {
                listaAgencia[i] = listaAgencia[numeroAgencias - 1];
                numeroAgencias--;
            }
        }
    }
    public void listaAgencia() {
        try {
            if (agenciasBancarias.size() > 0) {
                for (int i = 0; i < numeroAgencias; i++) {
                    listaAgencia[i].imprimirAgencias();
                }
            }
        } catch (Exception e) {
            System.out.println("Nao ha agencias cadastradas no momento!");
        }
    }

    public void imprimirAgencias() {
        System.out.println("Atualmente o numero da agencia e: " + codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Agencia.nome = nome;
    }

    public static int getNumeroContas() {
        return numeroContas;
    }

    public static void setNumeroContas(int numeroContas) {
        Agencia.numeroContas = numeroContas;
    }  
}
