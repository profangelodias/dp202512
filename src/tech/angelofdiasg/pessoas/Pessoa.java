package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private String telsContato;

    public void cadastrar(){

    }

    public int obterIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();

    }
}
