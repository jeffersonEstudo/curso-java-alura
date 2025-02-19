package PraticandoCurso2;

public class Carro {
    String modelo;
    int ano;
    String cor ;


    void mostrar(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

   void caracteristicasCar(String name, int anoFabri, String coloracao){
       modelo = name;
       ano = anoFabri;
       cor = coloracao;
   }



}
