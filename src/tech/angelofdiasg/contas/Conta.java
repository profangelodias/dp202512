package tech.angelofdiasg.contas;

import java.util.Random;

public class Conta {
    Random random = new Random();
    private int numero = random.nextInt(9000);
    private String nome;
    private double saldo;
    private double limite;
    private Conta(){}
    public Conta(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
        public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite = 10000;
    }
    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void depositar(double quantidade) {
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
