package tech.angelofdiasg.app;

import tech.angelofdiasg.auxiliares.Endereco;
import tech.angelofdiasg.auxiliares.Telefone;
import tech.angelofdiasg.pessoas.Pessoa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Juninho");

        //Data de nacimento
        LocalDate dataNascimento = LocalDate.
                of(1995, 4, 29);
        pessoa1.setDataNascimento(dataNascimento);

        //Endereço
        String logradouro = "logradouro 1";
        String complemento = "casa casa";
        String numero = "2A";
        String bairro = "O bairro";
        String cidade = "João";
        String cep = "55500-999";

        Endereco endereco1 = new Endereco(logradouro,complemento,numero,bairro,cidade,cep);
        pessoa1.setEndereco(endereco1);

        Telefone telefone1 = new Telefone();
        telefone1.setDdd("111");
        telefone1.setNumero("123654987");

    }
}
