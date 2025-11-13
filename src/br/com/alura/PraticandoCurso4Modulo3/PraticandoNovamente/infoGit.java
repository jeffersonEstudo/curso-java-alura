package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

public class infoGit {
    private String login;
    private int id;
    private String node_id;


    public infoGit(String login, int id, String node_id) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
    }

    public infoGit(PegandoTresInfoGit tresInfo) {
      this.login = tresInfo.login();
      this.id = tresInfo.id();
      this.node_id = tresInfo.node_id();
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

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    @Override
    public String toString() {
        return "Nome conta: " + login + "."+
                " ID da conta: " + id + "."+
                " Id do Node: " + node_id + ".";
    }


}
