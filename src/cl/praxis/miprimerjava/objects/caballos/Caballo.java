package cl.praxis.miprimerjava.objects.caballos;

public class Caballo implements Equino{
    private String nombre;
    private String fechaDeNacimiento;

    public Caballo(String nombre, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Caballo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                '}';
    }

    @Override
    public void hablar() { System.out.println("soy un caballo que habla"); }

    @Override
    public String relinchar(int veces) {
        veces = veces * 10;
        return "relincho x"+veces;
    }
}
