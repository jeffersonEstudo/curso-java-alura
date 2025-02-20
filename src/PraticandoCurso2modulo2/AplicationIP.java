package PraticandoCurso2modulo2;

import br.com.alura.PraticandoCurso2modulo2.IdadePessoa;

public class AplicationIP {
    public static void main(String[] args){
        IdadePessoa objetoIdadePesso = new IdadePessoa();

        objetoIdadePesso.setIdade(16);
        objetoIdadePesso.setName("Marta");
        objetoIdadePesso.mostra();
        objetoIdadePesso.verificarIdade();
    }
}
