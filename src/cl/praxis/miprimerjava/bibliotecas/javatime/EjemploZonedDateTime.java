package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class EjemploZonedDateTime {
    public static void main(String[] args) {
        // Obtener la fecha y hora actual en la zona horaria por defecto del sistema
        LocalDateTime fechaHoraLocal = LocalDateTime.now();
        System.out.println("Fecha y hora local: " + fechaHoraLocal);

        // Obtener la zona horaria por defecto del sistema
        ZoneId zonaHorariaPorDefecto = ZoneId.systemDefault();
        System.out.println("Zona horaria por defecto: " + zonaHorariaPorDefecto);

        // Crear un ZonedDateTime a partir de LocalDateTime y una zona horaria específica
        ZonedDateTime fechaHoraZona = ZonedDateTime.of(fechaHoraLocal, zonaHorariaPorDefecto);
        System.out.println("Fecha y hora en zona horaria específica: " + fechaHoraZona);

        // Obtener todas las zonas horarias disponibles en el sistema
        Set<String> zonasHorariasDisponibles = ZoneId.getAvailableZoneIds();
        System.out.println("Zonas horarias disponibles: " + zonasHorariasDisponibles);

        // Obtener la fecha y hora actual en una zona horaria específica
        ZoneId zonaHorariaNuevaYork = ZoneId.of("America/New_York");
        ZonedDateTime fechaHoraNuevaYork = ZonedDateTime.now(zonaHorariaNuevaYork);
        System.out.println("Fecha y hora en Nueva York: " + fechaHoraNuevaYork);
    }
}
