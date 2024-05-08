package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploDateTimeFormatter {
    public static void main(String[] args) {
        // Crear un objeto LocalDateTime para representar una fecha y hora
        LocalDateTime fechaHora = LocalDateTime.of(2024, 5, 6, 14, 30);

        // Formatear la fecha y hora utilizando un formato personalizado
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHora.format(formatoPersonalizado);
        System.out.println("Fecha y hora formateada: " + fechaHoraFormateada);

        // Analizar una cadena de texto en formato personalizado y convertirla a LocalDateTime
        String fechaHoraTexto = "20/12/2023 12:45:30";
        LocalDateTime fechaHoraParseada = LocalDateTime.parse(fechaHoraTexto, formatoPersonalizado);
        System.out.println("Fecha y hora parseada: " + fechaHoraParseada);

        // Utilizar un formato predefinido (ISO_LOCAL_DATE_TIME) para formatear la fecha y hora
        DateTimeFormatter formatoPredefinido = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String fechaHoraFormateadaPredefinida = fechaHora.format(formatoPredefinido);
        System.out.println("Fecha y hora formateada con formato predefinido: " + fechaHoraFormateadaPredefinida);
    }
}
