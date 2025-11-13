package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

public class PuxandoInterfaceGit extends infoGit implements InsterfaceGit {

    public PuxandoInterfaceGit(String login, int id, String node_id) {
        super(login, id, node_id);
    }


    @Override
    public String getIntergace() {
        return "";
    }

    @Override
    public String toString(){

        return "Nome2 conta " + this.getLogin() + this.getId() + this.getNode_id();
    }
}
