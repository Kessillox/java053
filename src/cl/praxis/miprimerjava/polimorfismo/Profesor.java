package cl.praxis.miprimerjava.polimorfismo;

public class Profesor extends Persona {
    private int edad;

    public Profesor() {
    }

    public Profesor(int edad) {
        this.edad = edad;
    }

    public Profesor(String nombre, String apellido, int rut, boolean presente, int edad) {
        super(nombre, apellido, rut, presente);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "edad=" + edad +
                "} " + super.toString();
    }
}
