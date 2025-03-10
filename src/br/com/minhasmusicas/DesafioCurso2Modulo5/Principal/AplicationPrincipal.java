package br.com.minhasmusicas.DesafioCurso2Modulo5.Principal;

import br.com.minhasmusicas.DesafioCurso2Modulo5.Entities.Audio;
import br.com.minhasmusicas.DesafioCurso2Modulo5.Entities.MinhasPreferidas;
import br.com.minhasmusicas.DesafioCurso2Modulo5.Entities.Musicas;
import br.com.minhasmusicas.DesafioCurso2Modulo5.Entities.Podcast;

public class AplicationPrincipal {

    public static void main(String[] args) {

        Musicas objMinhaMusica = new Musicas();

        objMinhaMusica.setTitulo("Forever");
        objMinhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {

            objMinhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            objMinhaMusica.curtir();
        }

        Podcast objPodcast = new Podcast();
        objPodcast.setTitulo("BolhaDEv");
        objPodcast.setHostApresentador("MArcus Mendes");


        for (int i = 0; i < 5000; i++) {
            objPodcast.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            objPodcast.curtir();
        }
        MinhasPreferidas objeMinhasPreferidas = new MinhasPreferidas();
        objeMinhasPreferidas.inclue(objPodcast);
        objeMinhasPreferidas.inclue(objMinhaMusica);

    }
}
