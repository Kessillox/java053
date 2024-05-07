package cl.praxis.miprimerjava.bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

public class JavaNet {
    public static void main(String[] args) throws IOException  {
        System.out.println("---- Consumir Api ------------------------------------");
        consumirApi();
        System.out.println("---- Consumir Txt ------------------------------------");
        consumirArchivo();
        System.out.println("------------------------------------------------------");
    }

    public static void consumirApi() throws IOException {
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

    public static void consumirArchivo() throws IOException {
        URL url = new URL("https://thenefelin.github.io/Viajes_Chile/assets/docs/Aloy.txt");
        URLConnection connection = url.openConnection();

        InputStream inputStream = connection.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        inputStream.close();
    }
}
