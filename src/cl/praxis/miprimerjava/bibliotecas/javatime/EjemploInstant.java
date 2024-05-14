package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class EjemploInstant {
    public static void main(String[] args) {
        // Obtener el instante actual en tiempo UTC
        Instant instanteActual = Instant.now();
        System.out.println("Instante actual en UTC: " + instanteActual);

        // Obtener el número de milisegundos desde el epoch (1970-01-01T00:00:00Z)
        long milisegundos = instanteActual.toEpochMilli();
        System.out.println("Milisegundos desde el epoch: " + milisegundos);

        // Crear un Instant a partir de un número de milisegundos
        Instant instanteDesdeEpoch = Instant.ofEpochMilli(milisegundos);
        System.out.println("Instante desde el epoch: " + instanteDesdeEpoch);

        // Crear un Instant a partir de una cadena de texto en formato ISO-8601
        Instant instanteDesdeString = Instant.parse("2024-05-06T12:00:00Z");
        System.out.println("Instante desde una cadena de texto: " + instanteDesdeString);

        Instant otroInstante = Instant.ofEpochSecond(1000000);
        long diferenciaEnSegundos = instanteActual.until(otroInstante, ChronoUnit.SECONDS);
        System.out.println("Diferencia en segundos entre instante actual y otro instante: " + diferenciaEnSegundos);
    }
}
