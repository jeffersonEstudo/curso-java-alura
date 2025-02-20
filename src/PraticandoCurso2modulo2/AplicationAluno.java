package PraticandoCurso2modulo2;

public class AplicationAluno {
    public static void main(String[] args){

      Aluno objetoAluno = new Aluno();

      objetoAluno.setNome("João");
      objetoAluno.setNotas(6);
      objetoAluno.setNotas(4);
      objetoAluno.setNotas(5);
      objetoAluno.mostra();
      objetoAluno.calcularMedia();


    }
}
