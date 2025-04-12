package br.com.alura.PraticandoCurso4Modulo1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class AplicationAPIdoTheMealDB {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entradaBusca = new Scanner(System.in);
        System.out.println("Qual receita está buscando?");
        var busca = entradaBusca.nextLine();
        var implementa = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(implementa))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
