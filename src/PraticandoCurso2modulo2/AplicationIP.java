package PraticandoCurso2modulo2;

public class AplicationIP {
    public static void main(String[] args){
        IdadePessoa objetoIdadePesso = new IdadePessoa();

        objetoIdadePesso.setIdade(16);
        objetoIdadePesso.setName("Marta");
        objetoIdadePesso.mostra();
        objetoIdadePesso.verificarIdade();
    }
}
