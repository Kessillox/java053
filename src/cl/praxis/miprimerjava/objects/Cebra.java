package cl.praxis.miprimerjava.objects;

public class Cebra implements Equino{
    private String nombre;

    public Cebra(String nombre) { this.nombre = nombre; }

    public String getNombre() {  return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Cebra{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void hablar() { System.out.println("Soy una cebra que no habla"); }

    @Override
    public String relinchar(int veces) { return "yo no hago esas cosas"; }
}
