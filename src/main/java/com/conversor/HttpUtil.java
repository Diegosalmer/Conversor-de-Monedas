package com.conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUtil {
    private static HttpClient client = HttpClient.newHttpClient();

    public static String sendGetRequest(String url) throws Exception {
        URI uri = URI.create(url);

        // Crear solicitud GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        // Enviar solicitud y devolver respuesta como String
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}