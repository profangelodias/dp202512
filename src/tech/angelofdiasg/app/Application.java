package tech.angelofdiasg.app;

import tech.angelofdiasg.contas.Conta;
import tech.angelofdiasg.contas.ContaEspecial;

public class Application {
    public static void main(String[] args) {
//        Conta contaUm = new Conta();
//
//        contaUm.nome = "Neto";
//        contaUm.numero = 01;
//        contaUm.limite = 10000000;
//        contaUm.saldo = 100000;
//
//        System.out.println("Nome:" + contaUm.nome);
//        System.out.println("Numero:" + contaUm.numero);
//        System.out.println("Limite:" + contaUm.limite);
//        System.out.println("Saldo:" + contaUm.saldo);
//
//        contaUm.sacar(1000);
//
//        System.out.println("Novo saldo:" + contaUm.saldo);
//

        Conta contaAqui = new Conta("O nome", 100);
        Conta contaDois = new Conta("Nome aqui", 1000, 10000);

        contaDois.
        ContaEspecial cEspc = new ContaEspecial();
        cEspc.sacar(1000);


    }
}
