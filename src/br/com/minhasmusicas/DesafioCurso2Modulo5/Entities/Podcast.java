package br.com.minhasmusicas.DesafioCurso2Modulo5.Entities;

public class Podcast extends Audio {
    private String hostApresentador;
    private String descricao;

    public String getHostApresentador() {
        return hostApresentador;
    }

    public void setHostApresentador(String hostApresentador) {
        this.hostApresentador = hostApresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtida() > 500){
            return 10;
        }else{
          return  8;
        }
    }
}
