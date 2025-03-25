package tech.angelofdiasg.contas;

public class Conta {
    public int numero;
    public String nome;
    public double saldo;
    public double limite;

    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

}
