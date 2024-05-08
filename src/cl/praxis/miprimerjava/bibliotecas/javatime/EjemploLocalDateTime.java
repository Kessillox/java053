package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.LocalDateTime;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        // Crear un objeto LocalDateTime representando la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        // Crear un objeto LocalDateTime con una fecha y hora específica
        LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2024, 5, 6, 14, 30, 0);
        System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);

        // Obtener los componentes de fecha y hora de un objeto LocalDateTime
        int año = fechaHoraEspecifica.getYear();
        int mes = fechaHoraEspecifica.getMonthValue();
        int día = fechaHoraEspecifica.getDayOfMonth();
        int hora = fechaHoraEspecifica.getHour();
        int minutos = fechaHoraEspecifica.getMinute();
        int segundos = fechaHoraEspecifica.getSecond();
        System.out.println("Fecha: " + día + "/" + mes + "/" + año);
        System.out.println("Hora: " + hora + ":" + minutos + ":" + segundos);

        // Realizar operaciones como agregar o restar días, horas, etc.
        LocalDateTime mañana = fechaHoraActual.plusDays(1);
        LocalDateTime haceUnaSemana = fechaHoraActual.minusWeeks(1);
        System.out.println("Mañana: " + mañana);
        System.out.println("Hace una semana: " + haceUnaSemana);

        // Verificar si una fecha y hora están antes o después de otra
        boolean esAntes = fechaHoraActual.isBefore(fechaHoraEspecifica);
        boolean esDespués = fechaHoraActual.isAfter(fechaHoraEspecifica);
        System.out.println("¿Fecha y hora actual es antes de fecha y hora específica? " + esAntes);
        System.out.println("¿Fecha y hora actual es después de fecha y hora específica? " + esDespués);
    }
}
