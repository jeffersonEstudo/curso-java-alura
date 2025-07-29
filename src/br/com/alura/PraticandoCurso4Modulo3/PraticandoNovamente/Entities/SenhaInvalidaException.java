package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente.Entities;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;
    public SenhaInvalidaException(String message) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {return this.mensagem;
    }
}
