package com.conversor;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {
    private static final String API_KEY = "10a4d6cf26ed8caadb7eee63"; // Clave de API
    private static final String BASE_URL = "https://api.exchangerate-api.com/v4/latest/";

    private final HttpClient httpClient;
    private final Gson gson; // Instancia de Gson

    public ExchangeRateService() {
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson(); // Inicializamos Gson
    }

    public ExchangeRateResponse getExchangeRate(String fromCurrency) {
        try {
            String url = BASE_URL + fromCurrency; // No se necesita el API key aquí, revisa si es necesario
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("Código de estado: " + response.statusCode());
                return gson.fromJson(response.body(), ExchangeRateResponse.class);
            } else {
                System.out.println("Error: " + response.statusCode());
                return null;
            }
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Obtener tasa filtrada
    public double getFilteredRate(ExchangeRateResponse response, String currencyCode) {
        return response.getRates().getOrDefault(currencyCode, 0.0);
    }

    // Método para convertir moneda
    public double convertCurrency(double amount, double rate) {
        return amount * rate;
    }
}
