package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta{

    public ContaEspecial(String nome, double saldo, double limite) {
        super(nome, saldo, limite);
    }

    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - (quantidade * 0.99);
        this.saldo = novoSaldo;
    }
}
