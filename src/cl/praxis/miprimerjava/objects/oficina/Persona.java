package cl.praxis.miprimerjava.objects.oficina;

public class Persona {
    private String nombre;
    private int rut;
    private double estatura;

    public Persona() {
    }

    public Persona(String nombre, int rut, double altura) {
        this.nombre = nombre;
        this.rut = rut;
        this.estatura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut=" + rut +
                ", altura=" + estatura +
                '}';
    }
}
