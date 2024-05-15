package cl.praxis.miprimerjava.objects.oficina;

public class Programador extends Persona {
    private String lenguajeProgramacion;

    public Programador(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Programador(String nombre, int rut, double altura, String lenguajeProgramacion) {
        super(nombre, rut, altura);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Programador() {
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajeProgramacion='" + lenguajeProgramacion + '\'' +
                "} " + super.toString();
    }
}
