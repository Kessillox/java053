package cl.praxis.miprimerjava.objects.escuela;

import java.time.LocalDate;

public class Instructor extends Persona {
    private String nivel;

    public Instructor() {
    }

    public Instructor(String nivel) {
        this.nivel = nivel;
    }

    public Instructor(String nombre, String apellido, LocalDate fechaNacimiento, int rut, String nivel) {
        super(nombre, apellido, fechaNacimiento, rut);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "nivel='" + nivel + '\'' +
                "} " + super.toString();
    }
}
