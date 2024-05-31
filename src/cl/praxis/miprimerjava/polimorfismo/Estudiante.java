package cl.praxis.miprimerjava.polimorfismo;

public class Estudiante extends Persona{
    private String identidadGenero;

    public Estudiante() {
    }

    public Estudiante(String identidadGenero) {
        this.identidadGenero = identidadGenero;
    }

    public Estudiante(String nombre, String apellido, int rut, boolean presente, String identidadGenero) {
        super(nombre, apellido, rut, presente);
        this.identidadGenero = identidadGenero;
    }

    public String getIdentidadGenero() {
        return identidadGenero;
    }

    public void setIdentidadGenero(String identidadGenero) {
        this.identidadGenero = identidadGenero;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "identidadGenero='" + identidadGenero + '\'' +
                "} " + super.toString();
    }
}
