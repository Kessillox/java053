package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.Duration;
import java.time.LocalTime;

public class EjemploDuration {
    public static void main(String[] args) {
        // Crear dos instancias de LocalTime para representar un intervalo de tiempo
        LocalTime inicio = LocalTime.of(9, 0, 0); // Hora de inicio: 9:00 AM
        LocalTime fin = LocalTime.of(10, 30, 0); // Hora de finalización: 10:30 AM

        // Calcular la duración entre las dos horas
        Duration duracion = Duration.between(inicio, fin);
        System.out.println("Duración entre " + inicio + " y " + fin + " es: " + duracion);

        // Obtener la duración en horas, minutos y segundos
        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;
        long segundos = duracion.getSeconds() % 60;

        System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos);
    }
}
