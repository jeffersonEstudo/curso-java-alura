package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class infoGit {
    private String login;
    private int id;
    private String created_at;


    public infoGit(String login, int id, String node_id) {
        this.login = login;
        this.id = id;
        this.created_at = node_id;
    }

    public infoGit(PegandoTresInfoGit tresInfo) {
       if (tresInfo.login().matches(".*[^a-zA-Z0-9].*") ){
         throw  new ErroIlegalArgumento("Erro na pesquisa." +
                 "A pesquisa tem careacter especial.");
         }
        this.login = tresInfo.login();
      this.id = tresInfo.id();
      this.created_at = tresInfo.created_at();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        // converter a string ISO para um Instant
        Instant instant = Instant.parse(created_at);

        // criar formatador do jeito que você quiser
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());

        // formatar
        String dataFormatada = formatter.format(instant);

        return "Nome conta: " + login + "."+
                " ID da conta: " + id + "."+
                " Data de criação: " + dataFormatada + ".";
    }


}
