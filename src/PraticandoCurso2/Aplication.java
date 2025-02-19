package PraticandoCurso2;

public class Aplication {
    public static void main(String[] args){
     //ATVI 1
     Pessoa objetoDaClassePessoa = new Pessoa();

     objetoDaClassePessoa.mostrar();


     //ATVI 2
     Calculadora objetoCalculadora = new Calculadora();

     System.out.println(objetoCalculadora.dobra(2));
     //ou:
     objetoCalculadora.dobra2(2);
        System.out.println();

     //ATVI 3
     Musica objetoMusica = new Musica();
        objetoMusica.avalia(2);
        objetoMusica.avalia(5);
        objetoMusica.avalia(5);
        objetoMusica.mostra();
        System.out.println();


     //ATVI 4
     Carro objetoCarro = new Carro();
     objetoCarro.caracteristicasCar("Uno", 2000,"Vermelho");
     objetoCarro.mostrar();

    }
}
