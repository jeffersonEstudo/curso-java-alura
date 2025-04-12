package br.com.alura.PraticandoCurso4Modulo1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class AplicationPrincipalGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entradaBusca = new Scanner(System.in);
        System.out.println("Qual livro gostaria de pesquisar?");
        var busca = entradaBusca.nextLine();
        var implementa = "https://www.googleapis.com/books/v1/volumes?q=" + busca;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(implementa))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
