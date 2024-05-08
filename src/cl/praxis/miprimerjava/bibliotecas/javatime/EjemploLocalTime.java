package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.LocalTime;

public class EjemploLocalTime {
    public static void main(String[] args) {
        // Crear un objeto LocalTime representando la hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        // Crear un objeto LocalTime con una hora específica
        LocalTime horaEspecifica = LocalTime.of(14, 30, 45); // 14:30:45
        System.out.println("Hora específica: " + horaEspecifica);

        // Obtener la hora, minutos y segundos de un objeto LocalTime
        int hora = horaEspecifica.getHour();
        int minutos = horaEspecifica.getMinute();
        int segundos = horaEspecifica.getSecond();
        System.out.println("Hora: " + hora + ", Minutos: " + minutos + ", Segundos: " + segundos);

        // Realizar operaciones como agregar o restar horas
        LocalTime horaEnUnaHora = horaActual.plusHours(1);
        LocalTime horaHaceDosHoras = horaActual.minusHours(2);
        System.out.println("Hora en una hora: " + horaEnUnaHora);
        System.out.println("Hora hace dos horas: " + horaHaceDosHoras);

        // Verificar si una hora está antes o después de otra
        boolean esAntes = horaActual.isBefore(horaEspecifica);
        boolean esDespués = horaActual.isAfter(horaEspecifica);
        System.out.println("¿Hora actual es antes de hora específica? " + esAntes);
        System.out.println("¿Hora actual es después de hora específica? " + esDespués);
    }
}
