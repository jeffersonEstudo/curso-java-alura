package br.com.alura.PraticandoCursoTresModulo3.Main;

import br.com.alura.PraticandoCursoTresModulo3.Entities.Circulo;
import br.com.alura.PraticandoCursoTresModulo3.Entities.Forma;
import br.com.alura.PraticandoCursoTresModulo3.Entities.Quadrado;

import java.io.FilterOutputStream;
import java.util.ArrayList;

public class AppArrayInterface {
    public static void main(String[] args) {

        var refeObjCirculo = new Circulo(5, 4);
        var refeObjQuadrado = new Quadrado(5, 5);

        ArrayList<Forma> lista = new ArrayList();
        lista.add(refeObjCirculo);
        lista.add(refeObjQuadrado);


        for (Forma forma: lista){


            if (forma instanceof Circulo){
                Circulo circulo = (Circulo) forma;
                System.out.println("Área do circulo: " + circulo.calcularArea() );
            }

            else if (forma instanceof Quadrado){
                Quadrado quadrado = (Quadrado) forma;
                System.out.println("Área do quadrado: " + quadrado.calcularArea());

            }
        }





    }
}
