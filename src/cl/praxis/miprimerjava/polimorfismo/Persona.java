package cl.praxis.miprimerjava.polimorfismo;

public class Persona {
    private String nombre;
    private String apellido;
    private int rut;
    private boolean presente;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int rut, boolean presente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.presente = presente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut=" + rut +
                ", presente=" + presente +
                '}';
    }
}
