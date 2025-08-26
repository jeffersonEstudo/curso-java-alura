package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class PesquisaGitHub {
    public static void main(String[] args) throws IOException, InterruptedException, ErroConsultaGitHubException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do perfil?");
        String digitacao = entrada.nextLine();

        String endereco = "https://api.github.com/users/" + digitacao;


        try {


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)) /*jeffersonEstudo*/
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());




            if (response.statusCode()== 404 ){
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
              }

            String json = response.body();


            Gson gson = new Gson();




            PegandoTresInfoGit tresInfo = gson.fromJson(json, PegandoTresInfoGit.class);
        }catch ( IOException | InterruptedException e){
            System.out.println("Houve um erro durante a consulta à API do GITHUB.");
            e.printStackTrace();
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }


    }
}
