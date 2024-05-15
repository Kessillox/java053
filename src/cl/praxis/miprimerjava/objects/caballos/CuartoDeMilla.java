package cl.praxis.miprimerjava.objects.caballos;

public class CuartoDeMilla extends Caballo{

    public String padre;
    public String madre;

    public CuartoDeMilla(String nombre, String fechaDeNacimiento, String padre, String madre) {
        super(nombre, fechaDeNacimiento);
        this.padre = padre;
        this.madre = madre;
    }

    public CuartoDeMilla(String padre, String madre) {
        this.padre = padre;
        this.madre = madre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    @Override
    public String toString() {
        return "CuartoDeMilla{" +
                "padre='" + padre + '\'' +
                ", madre='" + madre + '\'' +
                "} " + super.toString();
    }
}


