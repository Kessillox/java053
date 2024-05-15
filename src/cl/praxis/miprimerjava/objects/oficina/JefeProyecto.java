package cl.praxis.miprimerjava.objects.oficina;

public class JefeProyecto extends Persona{
    private String area;

    public JefeProyecto() {
    }

    public JefeProyecto(String area) {
        this.area = area;
    }

    public JefeProyecto(String nombre, int rut, double altura, String area) {
        super(nombre, rut, altura);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "JefeProyecto{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }
}
