package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente.Entities;

import br.com.alura.screenmath.modelosLocacaoMove.Exception2.ErroDeConversaoDeAnoException;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.TituloOmdb;

public class Senha {
    private String senha;

    public Senha() {
        this.senha = senha;
    }

    public Senha(SenhaInvalidaException objetoSenha){
        this.senha = senha;
        if (senha.length() > 8 || senha.length() < 8) {
            throw new SenhaInvalidaException("TESTE TESTINHO");

        }
    }





    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
