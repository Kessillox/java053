package cl.praxis.miprimerjava.bibliotecas.javatime;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        // Crear dos instancias de LocalDate para representar dos fechas
        LocalDate fechaInicio = LocalDate.of(2020, 1, 1);
        LocalDate fechaFin = LocalDate.of(2021, 12, 31);

        // Calcular el período entre las dos fechas
        Period periodo = Period.between(fechaInicio, fechaFin);
        System.out.println("Período entre " + fechaInicio + " y " + fechaFin + " es: " + periodo);

        // Obtener los componentes del período (años, meses, días)
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int días = periodo.getDays();

        System.out.println("Años: " + años + ", Meses: " + meses + ", Días: " + días);
    }
}
