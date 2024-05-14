package cl.praxis.miprimerjava.objects;

public class PuraSangre extends Caballo {
    private String padre;
    private String madre;

    public PuraSangre(String nombre, String fechaDeNacimiento, String padre, String madre) {
        super(nombre, fechaDeNacimiento);
        this.padre = padre;
        this.madre = madre;
    }

    public PuraSangre(String padre, String madre) {
        this.padre = padre;
        this.madre = madre;
    }

    public String getPadre() {
        return padre;
    }

    public String getMadre() {
        return madre;
    }

    @Override
    public String toString() {
        return "PuraSangre{" +
                "padre='" + padre + '\'' +
                ", madre='" + madre + '\'' +
                "} " + super.toString();
    }
}
