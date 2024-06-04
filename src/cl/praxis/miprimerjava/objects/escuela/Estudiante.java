package cl.praxis.miprimerjava.objects.escuela;
import java.time.LocalDate;

public class Estudiante extends Persona {
    private String grado;
    private LocalDate fechaIncorporacion;
    private LocalDate fechaExamen;

    public Estudiante() {
    }

    public Estudiante(String grado, LocalDate fechaIncorporacion, LocalDate fechaExamen) {
        this.grado = grado;
        this.fechaIncorporacion = fechaIncorporacion;
        this.fechaExamen = fechaExamen;
    }

    public Estudiante(String nombre, String apellido, LocalDate fechaNacimiento, int rut, String grado, LocalDate fechaIncorporacion, LocalDate fechaExamen) {
        super(nombre, apellido, fechaNacimiento, rut);
        this.grado = grado;
        this.fechaIncorporacion = fechaIncorporacion;
        this.fechaExamen = fechaExamen;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDate fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "grado='" + grado + '\'' +
                ", fechaIncorporacion=" + fechaIncorporacion +
                ", fechaExamen=" + fechaExamen +
                "} " + super.toString();
    }
}
