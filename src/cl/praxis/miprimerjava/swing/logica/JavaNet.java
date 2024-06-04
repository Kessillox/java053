package cl.praxis.miprimerjava.swing.logica;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JavaNet {
    public static String consumirArchivoUri() {
        URI uri = URI.create("https://thenefelin.github.io/Viajes_Chile/assets/docs/Aloy.txt");
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        String res = "";

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            res = response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return res;
    }
}
