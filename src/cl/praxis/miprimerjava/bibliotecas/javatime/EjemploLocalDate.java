package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.LocalDate;

public class EjemploLocalDate {
    public static void main(String[] args) {
        // Crear un LocalDate representando la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        // Crear un LocalDate representando una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2024, 5, 6);
        System.out.println("Fecha específica: " + fechaEspecifica);

        // Obtener el año, mes y día de un LocalDate
        int año = fechaEspecifica.getYear();
        int mes = fechaEspecifica.getMonthValue();
        int día = fechaEspecifica.getDayOfMonth();
        System.out.println("Año: " + año + ", Mes: " + mes + ", Día: " + día);

        // Realizar operaciones como agregar o restar días
        LocalDate mañana = fechaActual.plusDays(1);
        LocalDate haceUnaSemana = fechaActual.minusWeeks(1);
        System.out.println("Mañana: " + mañana);
        System.out.println("Hace una semana: " + haceUnaSemana);

        // Verificar si una fecha está antes o después de otra
        boolean esAntes = fechaActual.isBefore(fechaEspecifica);
        boolean esDespués = fechaActual.isAfter(fechaEspecifica);
        System.out.println("¿Fecha actual es antes de fecha específica? " + esAntes);
        System.out.println("¿Fecha actual es después de fecha específica? " + esDespués);
    }
}