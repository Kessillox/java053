package cl.praxis.miprimerjava.bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaNet {
    public static void main(String[] args) throws IOException  {

        URL url = new URL("https://bsite.net/metalflap/link");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.connect();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;

        System.out.println("Respuesta de la API:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        connection.disconnect();
    }
}
