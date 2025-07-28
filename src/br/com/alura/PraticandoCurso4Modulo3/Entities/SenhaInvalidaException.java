package br.com.alura.PraticandoCurso4Modulo3.Entities;

public class SenhaInvalidaException extends RuntimeException {
  private String mensagem;
    public SenhaInvalidaException(String message) {
        this.mensagem = message;
    }


    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
