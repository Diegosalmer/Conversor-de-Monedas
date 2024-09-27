package com.conversor;

import java.util.Map;

public class ExchangeRateResponse {
    private Map<String, Double> rates; // Mapa de tasas de cambio
    private String base;                // Moneda base
    private String date;                // Fecha de la tasa

    // Getters y Setters
    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
