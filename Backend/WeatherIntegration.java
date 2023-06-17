package Backend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherIntegration {
    /*
     Features we need:
     1) Integration with weather APIs
     2) Provide real-time weather information
    */

    // API URL and API key for weather data
    private static final String API_URL = "https://api.weatherapi.com/v1/current.json";
    private static final String API_KEY = "YOUR_API_KEY";

    // Method to get weather information
    public static void getWeatherInformation(String location) {
        try {
            // Create URL with location and API key
            String apiUrl = API_URL + "?key=" + API_KEY + "&q=" + location;

            // Create HTTP connection
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Get response code
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse and display weather information
                System.out.println("Weather Information for " + location + ":");
                System.out.println("---------------------------");
                System.out.println(response.toString());
            } else {
                System.out.println("Error: Failed to retrieve weather information. Response Code: " + responseCode);
            }

            // Close connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Specify location for weather information
        String location = "London, UK";

        // Get weather information
        getWeatherInformation(location);
    }
}

