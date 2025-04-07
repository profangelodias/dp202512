package tech.angelofdiasg.contas;

public class ContaInvestimento extends Conta{

    public double taxa;
    public int prazo;

    public ContaInvestimento(String nome, double saldo, double limite, double taxa, int prazo) {
        super(nome, saldo, limite);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - (quantidade * 1.01);
        this.saldo = novoSaldo;
    }

    public void depositar(double quantidade) {
        double novoSaldo = this.saldo + (quantidade * 0.99);
        this.saldo = novoSaldo;
    }

    public void aplicaRendimento (int prazo){
        //Simulando aplicação por mÊs
        if(prazo == 30) {
            double novoSaldo = this.saldo + (this.saldo * 1.000);
            this.saldo = novoSaldo;
        }
    }


}
