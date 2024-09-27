package com.conversor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrencyConverter {
    private static Scanner scanner = new Scanner(System.in);
    private List<String> conversionHistory = new ArrayList<>();

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.showMenu();
    }

    public void showMenu() {
        boolean running = true;

        while (running) {
            System.out.println("Bienvenido al Conversor de Monedas");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir de ARS (Peso Argentino) a USD (Dólar Estadounidense)");
            System.out.println("2. Convertir de BOB (Boliviano) a USD (Dólar Estadounidense)");
            System.out.println("3. Convertir de BRL (Real Brasileño) a USD (Dólar Estadounidense)");
            System.out.println("4. Convertir de CLP (Peso Chileno) a USD (Dólar Estadounidense)");
            System.out.println("5. Convertir de COP (Peso Colombiano) a USD (Dólar Estadounidense)");
            System.out.println("6. Mostrar Historial de Conversiones");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    double arsAmount = getAmount("ARS");
                    convertAndLog("ARS", "USD", arsAmount, convertARSToUSD(arsAmount));
                    break;
                case 2:
                    double bobAmount = getAmount("BOB");
                    convertAndLog("BOB", "USD", bobAmount, convertBOBToUSD(bobAmount));
                    break;
                case 3:
                    double brlAmount = getAmount("BRL");
                    convertAndLog("BRL", "USD", brlAmount, convertBRLToUSD(brlAmount));
                    break;
                case 4:
                    double clpAmount = getAmount("CLP");
                    convertAndLog("CLP", "USD", clpAmount, convertCLPToUSD(clpAmount));
                    break;
                case 5:
                    double copAmount = getAmount("COP");
                    convertAndLog("COP", "USD", copAmount, convertCOPToUSD(copAmount));
                    break;
                case 6:
                    showConversionHistory();
                    break;
                case 7:
                    running = false;
                    System.out.println("Saliendo del programa. ¡Gracias!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close(); // Cerrar el escáner al finalizar
    }

    private double getAmount(String currency) {
        System.out.print("Ingrese la cantidad en " + currency + ": ");
        return scanner.nextDouble();
    }

    private void convertAndLog(String fromCurrency, String toCurrency, double originalAmount, double convertedAmount) {
        String logEntry = String.format("Convertido %.2f %s a %.2f %s en %s",
                originalAmount, fromCurrency, convertedAmount, toCurrency, LocalDateTime.now());
        conversionHistory.add(logEntry);
        System.out.println(logEntry);
    }

    public double convertARSToUSD(double ars) {
        double exchangeRate = 0.005; // Ejemplo: 1 ARS = 0.005 USD
        return ars * exchangeRate;
    }

    public double convertBOBToUSD(double bob) {
        double exchangeRate = 0.14; // Ejemplo: 1 BOB = 0.14 USD
        return bob * exchangeRate;
    }

    public double convertBRLToUSD(double brl) {
        double exchangeRate = 0.19; // Ejemplo: 1 BRL = 0.19 USD
        return brl * exchangeRate;
    }

    public double convertCLPToUSD(double clp) {
        double exchangeRate = 0.0013; // Ejemplo: 1 CLP = 0.0013 USD
        return clp * exchangeRate;
    }

    public double convertCOPToUSD(double cop) {
        double exchangeRate = 0.00025; // Ejemplo: 1 COP = 0.00025 USD
        return cop * exchangeRate;
    }

    private void showConversionHistory() {
        System.out.println("Historial de Conversiones:");
        if (conversionHistory.isEmpty()) {
            System.out.println("No hay conversiones realizadas.");
        } else {
            for (String log : conversionHistory) {
                System.out.println(log);
            }
        }
    }
}
