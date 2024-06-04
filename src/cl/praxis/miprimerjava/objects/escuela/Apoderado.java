package cl.praxis.miprimerjava.objects.escuela;

import java.time.LocalDate;

public class Apoderado extends Persona {
    private int cuota;
    private int mensualidad;

    public Apoderado() {
    }

    public Apoderado(int cuota, int mensualidad) {
        this.cuota = cuota;
        this.mensualidad = mensualidad;
    }

    public Apoderado(String nombre, String apellido, LocalDate fechaNacimiento, int rut, int cuota, int mensualidad) {
        super(nombre, apellido, fechaNacimiento, rut);
        this.cuota = cuota;
        this.mensualidad = mensualidad;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    @Override
    public String toString() {
        return "Apoderado{" +
                "cuota=" + cuota +
                ", mensualidad=" + mensualidad +
                "} " + super.toString();
    }
}
